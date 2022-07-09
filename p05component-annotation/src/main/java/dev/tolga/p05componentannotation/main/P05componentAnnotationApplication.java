package dev.tolga.p05componentannotation.main;


import dev.tolga.p05componentannotation.beans.Vehicle;
import dev.tolga.p05componentannotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P05componentAnnotationApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();
    }

}
