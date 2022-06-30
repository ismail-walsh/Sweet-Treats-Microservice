package com.sweet.service;

import com.sweet.model.Courier;
import com.sweet.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@AllArgsConstructor
@Service
public class SweetTreatsService {

    private static final Logger LOGGER = Logger.getLogger(SweetTreatsService.class.getName());

    CourierService courierService;

    //Logger File Handler
    static {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(SweetTreatsService.class.getSimpleName() + ".log");
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.addHandler(fileHandler);
    }

    //Retrieve list of couriers from CourierService. This will update as per mongo database
    public List<Courier> getCouriers() {
        return courierService.getCouriers();
    }

    //Method to select the cheapest driver
    public List<Courier> availableCouriers(Order order) {

        List<Courier> courierList = new CopyOnWriteArrayList<>();

        for (Courier courier:getCouriers()) {
            boolean isAvailable = courier.isAvailability(order) && order.getDeliveryDistance() < courier.getDeliveryTolerance();
            if (order.isRequiresRefrigeration()) {
                if (isAvailable && courier.isRefrigerator()) {
                    courierList.add(courier);
                }
            } else if (isAvailable) {
                courierList.add(courier);
            }
        }
        return courierList;
    }

    public Courier selectCourier(Order order){
        List<Courier> courierList = availableCouriers(order);
        Courier cheapestCourier = null;
        for (Courier courier:courierList) {
            double high = Double.POSITIVE_INFINITY;
            cheapestCourier = (courier.getRatePerMile() < high)? courier:cheapestCourier;
        }
        return cheapestCourier;
    }

    public double tippingSuggestion(Order order) {

        double tipping = 0.75 * order.getDeliveryDistance();

        if (tipping > 3) {
            tipping = 3;
        }

        if (tipping < 1) {
            tipping = 1;
        }
        return tipping;
    }
}
