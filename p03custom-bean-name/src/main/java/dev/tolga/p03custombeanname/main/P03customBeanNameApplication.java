package dev.tolga.p03custombeanname.main;


import dev.tolga.p03custombeanname.beans.Vehicle;
import dev.tolga.p03custombeanname.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P03customBeanNameApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: "+veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: "+veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: "+veh3.getName());
    }

}
