package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Audi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is : " + name;
    }
}
