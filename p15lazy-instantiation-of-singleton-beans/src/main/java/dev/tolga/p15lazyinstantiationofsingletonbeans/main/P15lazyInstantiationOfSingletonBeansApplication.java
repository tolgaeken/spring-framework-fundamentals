package dev.tolga.p15lazyinstantiationofsingletonbeans.main;


import dev.tolga.p15lazyinstantiationofsingletonbeans.beans.Person;
import dev.tolga.p15lazyinstantiationofsingletonbeans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P15lazyInstantiationOfSingletonBeansApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context");
    }

}
