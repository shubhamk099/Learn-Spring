package com.shubham.Main;

import com.shubham.config.ProjectConfig;
import com.shubham.model.Song;
import com.shubham.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example20 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");

        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
        String applyBreakStatus = vehicleServices.applyBreaks(vehicleStarted);

        System.out.println(moveVehicleStatus);
        System.out.println(playMusicStatus);
        System.out.println(applyBreakStatus);

        context.close();
    }
}
