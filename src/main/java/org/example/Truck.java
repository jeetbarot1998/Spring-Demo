package org.example;


// Truck.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck {
//    @Autowired => Putting a autowire here will not work
//    Why? Because instantiation of the object Truck needs an object of the
//    Engine class. Autowiring will make an object as an attribute but will
//    not provide a solution to removing the @Autowire annotation above the
//    constructor. As the constructor method
//    needs an already made Engine object which is given by the bean in config file
    private final Engine engine;

    @Autowired // Mentioning that look out for a bean definition either in the
//    config file or look out for a component tag which matches
//    the below requirements. Ie. which has a single arg constructor of type Truck
    public Truck(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Truck with " + engine.getType() + " engine started.");
    }
}
