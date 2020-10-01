package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringbootApplication {

	public static void main(String[] args) {
		System.out.println("Application started...");
		SpringApplication.run(TestSpringbootApplication.class, args);
	}

}
