package com.example.azurespringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("https://react-demo.azurewebsites.net")
@SpringBootApplication
@RestController
public class AzureSpringDemoApplication {
	
	@GetMapping("/")
	public String showMessage() {
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
