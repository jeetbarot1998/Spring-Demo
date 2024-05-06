package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    @Qualifier("car")
    public Vehicle myVehicle;

    @Autowired
    @Qualifier("getVehicleBike")
    public Vehicle myVehicle2;

}


class Runner{
    public static void main(String[] args) {
        ApplicationContext factory =
                new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleService b = factory.getBean(VehicleService.class);
        b.myVehicle.drive();
        b.myVehicle2.drive();
    }
}