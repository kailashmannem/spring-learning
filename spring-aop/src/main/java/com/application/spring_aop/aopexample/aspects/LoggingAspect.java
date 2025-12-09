package com.application.spring_aop.aopexample.aspects;

import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //Pointcut - When?
    //expression - execution(* PACKAGE.CLASS.METHOD(..))
    @Before("execution(* com.application.spring_aop.aopexample.business.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        //logic - What?
        logger.info("Before Aspect - Method is called - {}", joinPoint.getSignature());
    }
    
}
