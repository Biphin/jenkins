package com.biphin.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {
	
	@GetMapping
	public String heello() {
		return "Hello Jenkins, here I come, lets seee, hahaha.";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
