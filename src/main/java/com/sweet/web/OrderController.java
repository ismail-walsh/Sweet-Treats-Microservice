package com.sweet.web;

import com.sweet.model.Courier;
import com.sweet.model.Order;
import com.sweet.service.CourierService;
import com.sweet.service.OrderService;
import com.sweet.service.SweetTreatsService;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/SweetTreats")
@AllArgsConstructor
public class OrderController {

    private OrderService orderService;
    private SweetTreatsService sweetTreatsService;

    //Will generate a customer ID given some information
    @PostMapping(value = "/orders")
    public Order addOrder(@RequestBody Order order){
        System.out.println(order.getDeliveryDistance());
        System.out.println(order.getReadyTime());
        System.out.println(order.isRequiresRefrigeration());
        return orderService.addOrder(order);
    }

    @GetMapping(value = "/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping(value = "/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable("id") String id){
        return orderService.getOrderById(id);
    }

    @DeleteMapping(value ="/orders")
    public void deleteAllOrders(){orderService.deleteAllOrders();}

    @DeleteMapping(value = "/orders/{id}")
    public void deleteOrderById(@PathVariable("id") String id){
        orderService.deleteOrderById(id);
    }

    @GetMapping("/cheapest/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Courier cheapestCourier(@PathVariable("id") String id) {
        Optional<Order> latestOrder = getOrderById(id);
        System.out.println(getOrderById(id));
        if(getOrderById(id).isPresent()){
        return sweetTreatsService.selectCourier(latestOrder.get());
        }
        else {System.out.println("No order given");}
        return sweetTreatsService.selectCourier(latestOrder.get());
    }
}
