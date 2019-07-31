package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Ass4EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ass4EurekaServiceApplication.class, args);
	}

	// rest api url
	@RequestMapping
	public String demoMethod() {
		return "<h1>Login successful!</h1>";
	}

}
