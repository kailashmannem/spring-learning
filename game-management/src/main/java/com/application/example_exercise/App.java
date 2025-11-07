package com.application.example_exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        var dataservice = new AnnotationConfigApplicationContext(App.class);
        System.out.println(dataservice.getBean(BusinessCalculationService.class).findMax());
        dataservice.close();
    }
}
