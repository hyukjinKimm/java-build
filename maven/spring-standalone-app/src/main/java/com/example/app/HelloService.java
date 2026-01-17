package com.example.app;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String sayHello() {
        return "Hello Spring + Maven 👋";
    }
}

