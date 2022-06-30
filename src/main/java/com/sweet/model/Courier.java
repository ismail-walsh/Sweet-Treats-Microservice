package com.sweet.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Courier {
    @Id
    private String id;

    private String name;
    private LocalTime start;
    private LocalTime finish;
    private double ratePerMile;
    private int deliveryTolerance;
    private boolean refrigerator;

    public Courier(String name, LocalTime start, LocalTime finish, double ratePerMile, int deliveryTolerance, boolean refrigerator) {
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.ratePerMile = ratePerMile;
        this.deliveryTolerance = deliveryTolerance;
        this.refrigerator = refrigerator;
    }

    public boolean isAvailability(Order order) {
        return order.getReadyTime().isBefore(this.finish) && order.getReadyTime().isAfter(this.start);
    }
}
