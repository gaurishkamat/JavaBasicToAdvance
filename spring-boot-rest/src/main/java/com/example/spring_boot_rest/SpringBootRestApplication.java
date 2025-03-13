package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootRestApplication.class, args);
		Product bean = context.getBean(Product.class);
	}

}
