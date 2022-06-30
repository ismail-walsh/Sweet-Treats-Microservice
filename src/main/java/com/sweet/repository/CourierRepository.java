package com.sweet.repository;

import com.sweet.model.Courier;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface CourierRepository extends MongoRepository<Courier, String> {
    @Override
    Optional<Courier> findById(String s);

    @Override
    void deleteAll();

    @Override
    void deleteById(String s);

    @Override
    List<Courier> findAll();

}
