package com.hcl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		System.out.println("I am in Demo Application");

		SpringApplication.run(DemoApplication.class, args);
	}

}
