package dev.tolga.p10wiringbeansusingmethodparameters.main;


import dev.tolga.p10wiringbeansusingmethodparameters.beans.Person;
import dev.tolga.p10wiringbeansusingmethodparameters.beans.Vehicle;
import dev.tolga.p10wiringbeansusingmethodparameters.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P10wiringBeansUsingMethodParametersApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }

}
