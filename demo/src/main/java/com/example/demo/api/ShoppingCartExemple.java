package com.example.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShoppingCartExemple {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ShoppingCartExemple.class, args);
	}
}
