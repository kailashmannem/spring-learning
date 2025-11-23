package com.application.restful_web_services.helloWorld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    @GetMapping(path = "/hello-world")
    public String hello() {
        return "Hello World";
    }
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World from Bean");
    }
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloPatHelloWorldBean(@PathVariable String name) {
        return new HelloWorldBean("Hello World, " + name);
    }
    
    @GetMapping(path = "/hello-world-internationalized")
    public String helloInternationlized() {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("good.morning.message", null, "Default Message", locale);
        return message;
    }
}
