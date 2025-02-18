package com.gaurish.SpringBootDemo;

import com.gaurish.SpringBootDemo.model.Alien;
import com.gaurish.SpringBootDemo.model.Laptop;
import com.gaurish.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Hello World!!");

		LaptopService laptopService = context.getBean(LaptopService.class);
		Alien alien = context.getBean(Alien.class);
		alien.code();

		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addLaptop(laptop);

	}

}
