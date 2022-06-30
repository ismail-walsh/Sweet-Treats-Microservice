//package com.sweet.walsh;
//
//import com.sweet.entity.Application;
//import com.sweet.model.Order;
//import com.sweet.repository.OrderRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.IOException;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class OrderRepositoryTest {
//    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());
//    //Logger File Handler
//    static {
//        FileHandler fileHandler = null;
//        try {
//            fileHandler = new FileHandler(Application.class.getSimpleName() + ".log");
//            fileHandler.setFormatter(new SimpleFormatter());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        LOGGER.addHandler(fileHandler);
//    }
//
//    OrderRepository orderRepository;
//
//
//    @Test
//    public void createRows(){
//        orderRepository.deleteAll();
//        orderRepository.save(new Order(LocalTime.parse("09:00", DateTimeFormatter.ISO_TIME), 2, true));
//        orderRepository.save(new Order(LocalTime.parse("10:00", DateTimeFormatter.ISO_TIME), 4, false));
//
//        orderRepository.findAll().forEach(System.out::println);
//    }
//}
