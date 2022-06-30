package com.sweet.repository;

import com.sweet.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order, String>{
    @Override
    Optional<Order> findById(String s);

    @Override
    void deleteAll();

    @Override
    void deleteById(String s);

    @Override
    List<Order> findAll();

}
