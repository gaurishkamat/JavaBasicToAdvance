package com.ecom.SpringEcom.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

            //return type class-name.method-name(args)
            @Before("execution(* com.ecom.SpringEcom.service.ProductService.getAllProducts(..))")
            public void logMethodCall(){
                LOGGER.info("Method called");
            }

            @After("execution(* com.ecom.SpringEcom.service.ProductService.getAllProducts(..)")
            public void logMethodExecuted(){
                LOGGER.info("Method executed");
            }

            @Around("execution(* com.ecom.SpringEcom.service.ProductService.getAllProducts(..)")
            public void logMethodTime(){
                LOGGER.info("Method time");
            }
}
