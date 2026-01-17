package com.example.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());

        context.close();
    }
}

