package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean(name = "getVehicleBike")
    public Vehicle getVehicle(){
        return new Bike();
    }

    @Bean
    public Tyre getTyre(){
        return new Tyre();
    }

    @Bean
    public Engine getEngine(){
        return new Engine("MyEngine");
    }
}
