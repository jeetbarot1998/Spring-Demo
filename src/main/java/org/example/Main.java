package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        usingXML();
        usingAnnotations();
        TyreBeanProperty();
        TyreBeanPropertyUsingConstructor();
        AutowiredAnnotation();
        AnnotationBased();
    }

    static void usingXML(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");
        Vehicle car = (Vehicle) context.getBean("vehicleCar");
        car.drive();
    }

    static void usingAnnotations(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring_annotation.xml");
        Vehicle car = (Vehicle) context.getBean("vehicleBike");
        car.drive();
    }


    static void TyreBeanProperty(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring_annotation.xml");
        Tyre tyre = (Tyre) context.getBean("tyreUsingSetter");
        System.out.println("using Setters" + tyre);
    }

    static void TyreBeanPropertyUsingConstructor(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring_constructor.xml");
        Tyre tyre = (Tyre) context.getBean("tyreUsingConstructor");
        System.out.println("using constructor" + tyre);
    }

    static void AutowiredAnnotation(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring_annotation.xml");
        Car car = (Car) context.getBean("vehicleCar");
        car.drive();
        System.out.println("using Auto Wired");
    }

    static void AnnotationBased(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring_without_xml_config.xml");
        Car car = (Car) context.getBean("car");
        car.drive();
        System.out.println("Using Total Annotation Based and No XML");

    }

}


