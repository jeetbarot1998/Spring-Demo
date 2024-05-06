package org.example;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;

    public String getBrand() {
        System.out.println("Called getters");
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Called Setter");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public Tyre(String brand) {
        System.out.println("called constructor with args");
        this.brand = brand;
    }

    public void spin(){
        System.out.println("Tyres are spinning");
    }

    public Tyre() {
        System.out.println("called constructor");
    }
}
