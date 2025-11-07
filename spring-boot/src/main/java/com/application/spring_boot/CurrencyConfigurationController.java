package com.application.spring_boot;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CurrencyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration configuration;
    
    @RequestMapping("/currency-controller")
    public CurrencyServiceConfiguration getCurrencyConfiguration() {
        return configuration;
    }
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    
}
