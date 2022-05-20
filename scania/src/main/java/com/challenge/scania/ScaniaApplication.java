package com.challenge.scania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.challenge.scania.controller")
public class ScaniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaniaApplication.class, args);
	}

}
