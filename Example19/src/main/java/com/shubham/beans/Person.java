package com.shubham.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Person {
    private String name;
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicleBean") Vehicle vehicle) {
        System.out.println("Person bean created in Spring Context!");
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
        return this.vehicle;
    }
}
