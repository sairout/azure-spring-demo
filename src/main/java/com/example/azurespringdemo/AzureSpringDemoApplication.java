package com.example.azurespringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringDemoApplication {

	@GetMapping("/home")
	public String showMessage() {
		return "Success";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureSpringDemoApplication.class, args);
	}

}