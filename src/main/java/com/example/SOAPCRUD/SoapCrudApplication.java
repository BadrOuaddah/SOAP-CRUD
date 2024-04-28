package com.example.SOAPCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.SOAPCRUD")
public class SoapCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapCrudApplication.class, args);
	}

}
