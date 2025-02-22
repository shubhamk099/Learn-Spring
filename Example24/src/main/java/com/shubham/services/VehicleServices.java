package com.shubham.services;

import com.shubham.interfaces.LogAspect;
import com.shubham.interfaces.Speakers;
import com.shubham.interfaces.Tyers;
import com.shubham.model.Song;
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

    public VehicleServices() {
        System.out.println("VehicleServices bean created in Spring Context!");
    }

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
        return speakers.makeSound(song);
    }

    public String moveVehicle(Boolean vehicleStarted) {
        return tyers.rotate();
    }

    public String applyBreaks(Boolean vehicleStarted) {
        return tyers.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public Tyers getTyers() {
        return tyers;
    }
}
