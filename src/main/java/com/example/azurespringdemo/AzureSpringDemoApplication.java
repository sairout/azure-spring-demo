package com.example.azurespringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringDemoApplication {

	@GetMapping("/")
	public String showMessage() {
		return "Success";
	}
	@GetMapping("/home")
	public String showMessage1() {
		return "Success";
	}
	@GetMapping("/*")
	public String errorMessage() {
		return "404 Error";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureSpringDemoApplication.class, args);
	}

}
