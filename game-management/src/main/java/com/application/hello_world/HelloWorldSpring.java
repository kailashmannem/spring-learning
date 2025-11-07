package com.application.hello_world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}

@Configuration
public class HelloWorldSpring {
    @Bean
    public String name() {
        return "Game Management Application";
    }

    @Bean
    public int age() {
        return 2024;
    }

    @Bean(name = "introduction") // Custom bean name
    public String welcome() {
        return "Welcome to the Game Management Application!";
    }

    @Bean
    public Person person() {
        var person = new Person("Alice", 30);
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    @Bean
    public Person person3Parameters(String name, int age) {
        return new Person(name, age);
    }
}
