package dev.tolga.p08creatingbeansusingxmlconfiguration.main;


import dev.tolga.p08creatingbeansusingxmlconfiguration.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class P08creatingBeansUsingXmlConfigurationApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
    }

}
