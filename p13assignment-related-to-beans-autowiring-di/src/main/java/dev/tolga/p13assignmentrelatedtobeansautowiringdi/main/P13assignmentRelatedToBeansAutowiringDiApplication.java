package dev.tolga.p13assignmentrelatedtobeansautowiringdi.main;


import dev.tolga.p13assignmentrelatedtobeansautowiringdi.beans.Person;
import dev.tolga.p13assignmentrelatedtobeansautowiringdi.beans.Vehicle;
import dev.tolga.p13assignmentrelatedtobeansautowiringdi.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P13assignmentRelatedToBeansAutowiringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }

}
