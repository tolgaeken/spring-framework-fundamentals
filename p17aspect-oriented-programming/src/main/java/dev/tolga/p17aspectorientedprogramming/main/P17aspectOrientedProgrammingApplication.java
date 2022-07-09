package dev.tolga.p17aspectorientedprogramming.main;


import dev.tolga.p17aspectorientedprogramming.config.ProjectConfig;
import dev.tolga.p17aspectorientedprogramming.model.Song;
import dev.tolga.p17aspectorientedprogramming.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class P17aspectOrientedProgrammingApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
    }

}
