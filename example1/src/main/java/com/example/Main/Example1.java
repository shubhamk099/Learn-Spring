package com.example.Main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from the non-spring context is : " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the spring context is : " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from the spring context is : " + hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from the spring context is : " + num);
    }
}
