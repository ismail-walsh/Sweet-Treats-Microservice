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
public class Order {
    @Id
    String id;

    private LocalTime readyTime;
    private double deliveryDistance;
    private boolean requiresRefrigeration;

    public Order(LocalTime readyTime, double deliveryDistance, boolean requiresRefrigeration) {
        this.readyTime = readyTime;
        this.deliveryDistance = deliveryDistance;
        this.requiresRefrigeration = requiresRefrigeration;
    }
}