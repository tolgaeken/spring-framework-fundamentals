package dev.tolga.p09wiringbeansusingmethodcall.main;


import dev.tolga.p09wiringbeansusingmethodcall.beans.Person;
import dev.tolga.p09wiringbeansusingmethodcall.beans.Vehicle;
import dev.tolga.p09wiringbeansusingmethodcall.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P09wiringBeansUsingMethodCallApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }

}
