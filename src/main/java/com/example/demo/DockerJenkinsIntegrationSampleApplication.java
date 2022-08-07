package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntegrationSampleApplication {

	@GetMapping("dockerIntegration")
	public String dockerIntegration() {
		return "welcome to docker jenkins integration";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
	}

}
