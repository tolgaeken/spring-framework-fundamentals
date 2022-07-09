package dev.tolga.p02nouniquebeandefinitonexception.main;


import dev.tolga.p02nouniquebeandefinitonexception.beans.Vehicle;
import dev.tolga.p02nouniquebeandefinitonexception.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P02noUniqueBeanDefinitonExceptionApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //NoUniqueBeanDefinitonException
        // Vehicle veh = context.getBean(Vehicle.class);

        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }

}
