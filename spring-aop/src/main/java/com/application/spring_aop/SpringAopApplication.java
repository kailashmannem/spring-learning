package com.application.spring_aop;

import com.application.spring_aop.aopexample.business.BusinessService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private BusinessService businessService;
    public SpringAopApplication(BusinessService businessService) {
        this.businessService = businessService;
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        logger.info("Value returned is {}", businessService.calculateMax());
    }
}
