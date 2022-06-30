package com.sweet.service;

import com.sweet.model.Order;
import com.sweet.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Service layer contains business logic for application.
@AllArgsConstructor
@Service
public class OrderService {
    OrderRepository orderRepository;

    public Order addOrder(Order order){return orderRepository.save(order);}

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(String Id){
       return orderRepository.findById(Id);
    }

    public void deleteOrderById(String Id){orderRepository.deleteById(Id);}

    public void deleteAllOrders(){orderRepository.deleteAll();}
}

