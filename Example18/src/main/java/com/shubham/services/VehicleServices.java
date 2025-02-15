package com.shubham.services;

import com.shubham.interfaces.Speakers;
import com.shubham.interfaces.Tyers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "vehicleServicesBean")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyers tyers;

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String status = tyers.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public Tyers getTyers() {
        return tyers;
    }
}
