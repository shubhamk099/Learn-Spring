package com.shubham.beans;

import com.shubham.services.VehicleServices;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name;
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(@Qualifier("vehicleServicesBean") VehicleServices vehicleServices) {
        System.out.println("Vehicle bean created in Spring Context!");
        this.vehicleServices = vehicleServices;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Toyota";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return this.vehicleServices;
    }
}
