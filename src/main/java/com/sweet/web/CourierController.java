package com.sweet.web;


import com.sweet.model.Courier;
import com.sweet.model.Order;
import com.sweet.service.CourierService;
import com.sweet.service.SweetTreatsService;
import com.sweet.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;


@RestController
@RequestMapping("/SweetTreats")
@AllArgsConstructor
public class CourierController {

    private CourierService courierService;

    //Will generate a customer ID given some information
    @PostMapping(value = "/courier")
    public Courier addCourier(@RequestBody Courier courier){
        System.out.println(courier.getName());
        System.out.println(courier.getRatePerMile());
        System.out.println(courier.getDeliveryTolerance());
        System.out.println(courier.getStart());
        System.out.println(courier.getFinish());
        return courierService.addCourier(courier);
    }

    @PostMapping(value = "/couriers/many")
    public List<Courier> addCouriers(@RequestBody List<Courier> courier){
        return courierService.addCouriers(courier);
    }

    @GetMapping(value = "/couriers")
    public List<Courier> getCouriers(){
        return courierService.getCouriers();
    }

    @GetMapping(value = "/couriers/{id}")
    public Optional<Courier> getCourierById(@PathVariable("id") String id){
        return courierService.getCourierById(id);
    }

    @DeleteMapping(value = "/couriers")
    public void deleteAllCouriers(){courierService.deleteAllCouriers();}

    @DeleteMapping(value = "/couriers/{id}")
    public void deleteCourierById(@PathVariable("id") String id){
        courierService.deleteCourierById(id);
    }
}