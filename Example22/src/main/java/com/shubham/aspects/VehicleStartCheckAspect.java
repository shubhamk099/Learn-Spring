package com.shubham.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class VehicleStartCheckAspect {
    private final Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.shubham.services.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if(!vehicleStarted) {
            throw new RuntimeException("Vehicle not started");
        }
    }
}
