package dev.tolga.p04primaryannotation.main;


import dev.tolga.p04primaryannotation.beans.Vehicle;
import dev.tolga.p04primaryannotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P04primaryAnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());
    }

}
