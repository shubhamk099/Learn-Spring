package com.shubham.Main;

import com.shubham.config.ProjectConfig;
import com.shubham.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServicesBean", VehicleServices.class);

        System.out.println("Hashcode of the object vehicleService1 : " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleService2 : " + vehicleServices2.hashCode());

        if(vehicleServices1 == vehicleServices2) {
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }

        context.close();
    }
}
