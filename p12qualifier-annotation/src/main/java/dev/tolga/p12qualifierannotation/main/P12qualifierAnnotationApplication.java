package dev.tolga.p12qualifierannotation.main;


import dev.tolga.p12qualifierannotation.beans.Person;
import dev.tolga.p12qualifierannotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P12qualifierAnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }

}
