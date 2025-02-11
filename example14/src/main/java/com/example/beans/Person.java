package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Lucy";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
