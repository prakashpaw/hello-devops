
package com.example.devops.app;

public class AppService {
    public String greet(String name) {
        if (name == null || name.isBlank()) {
            name = "World";
        }
        return "Hello, " + name + " — innovate, automate, measure, improve!";
    }
}
