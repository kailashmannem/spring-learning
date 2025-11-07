package com.application.hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld { 
    public static void main(String[] args) {
        // Launch a spring conext or application
        // Configure the things that we want Spring to manage - @Configuration
        var context = new AnnotationConfigApplicationContext(HelloWorldSpring.class);
        System.out.println(context.getBean("introduction"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean(Person.class));
        context.close();
    }
    
}
