package com.shubham.services;

import com.shubham.interfaces.Speakers;
import com.shubham.interfaces.Tyers;
import com.shubham.model.Song;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component(value = "vehicleServicesBean")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {
    private static final Log log = LogFactory.getLog(VehicleServices.class);
    private final Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyers tyers;

    public VehicleServices() {
        System.out.println("VehicleServices bean created in Spring Context!");
    }

    public String playMusic(boolean vehicleStarted, Song song) {
//        Instant start = Instant.now();
//        logger.info("method execution started");
//        String music = null;
//        if(vehicleStarted) {
//            music = speakers.makeSound(song);
//        } else {
//            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
//        }
//        logger.info("method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        logger.info("Time took to execute the method : " + timeElapsed);
        return speakers.makeSound(song);
    }

    public String moveVehicle(Boolean vehicleStarted) {
//        Instant start = Instant.now();
//        logger.info("method execution started");
//        String status = null;
//        if(vehicleStarted) {
//            status = tyers.rotate();
//        } else {
//            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
//        }
//        logger.info("method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        logger.info("Time took to execute the method : " + timeElapsed);
        return tyers.rotate();
    }

    public String applyBreaks(Boolean vehicleStarted) {
//        Instant start = Instant.now();
//        logger.info("method execution started");
//        String status = null;
//        if(vehicleStarted) {
//            status = tyers.stop();
//        } else {
//            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
//        }
//        logger.info("method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        logger.info("Time took to execute the method : " + timeElapsed);
        return tyers.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public Tyers getTyers() {
        return tyers;
    }
}
