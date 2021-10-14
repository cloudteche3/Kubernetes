package com.kubernetes.DockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class KubernetesDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesDockerDemoApplication.class, args);
		
	}
	
	@GetMapping("/testing")
	
	public String testing() {
		
		return "testing for kubernetes demo---------";
	}

}
