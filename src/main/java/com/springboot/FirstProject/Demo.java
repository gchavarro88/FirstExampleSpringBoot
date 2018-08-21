package com.springboot.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Demo {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello PSL!";
	}
	
	
	public static void main(String args[]) {
		SpringApplication.run(Demo.class, args);
	}
	
	
}
