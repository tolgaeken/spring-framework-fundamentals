package dev.tolga.p06postconstructpredestroyannotations.main;


import dev.tolga.p06postconstructpredestroyannotations.beans.Vehicle;
import dev.tolga.p06postconstructpredestroyannotations.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P06postconstructPredestroyAnnotationsApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        //Post-construct
        System.out.println("Component Vehicle name from " +
                "Spring Context is: " + vehicle.getName());

        vehicle.printHello();

        //Pre-destroy
        context.close();
    }

}
