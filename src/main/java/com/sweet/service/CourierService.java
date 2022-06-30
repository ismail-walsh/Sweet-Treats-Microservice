package com.sweet.service;

import com.sweet.model.Courier;
import com.sweet.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourierService {

    CourierRepository courierRepository;

    public List<Courier> addCouriers(List<Courier> courier){return courierRepository.saveAll(courier);}

    public Courier addCourier(Courier courier){return courierRepository.save(courier);}

    public List<Courier> getCouriers(){
        return courierRepository.findAll();
    }

    public Optional<Courier> getCourierById(String Id){
        return courierRepository.findById(Id);
    }

    public void deleteCourierById(String Id){courierRepository.deleteById(Id);}

    public void deleteAllCouriers(){courierRepository.deleteAll();}

}
