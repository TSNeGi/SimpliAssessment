package io.spring.deployment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController 

public class SpringController {
	
	@RequestMapping("/")  
	public String welcome()   
	{  
	String print="Successfully deployed the Spring Boot App. \n Its AWS with Docker."; 
	return print;
	}  
}
