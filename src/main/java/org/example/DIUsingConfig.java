package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIUsingConfig {
    public static void main(String[] args) {
        ApplicationContext factory =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Bike b = factory.getBean(Bike.class);
        b.drive();
    }
}


class Run{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Truck truck = context.getBean(Truck.class);
        truck.start();

        context.close();
    }
}
