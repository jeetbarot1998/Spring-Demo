package org.example;
// Engine.java

import org.springframework.stereotype.Component;

//@Component
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

