package dev.tolga.p16prototypebeans.main;


import dev.tolga.p16prototypebeans.config.ProjectConfig;
import dev.tolga.p16prototypebeans.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P16prototypeBeansApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " +vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " +vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }else{
            System.out.println("VehicleServices bean is a prototype scoped bean");
        }
    }

}
