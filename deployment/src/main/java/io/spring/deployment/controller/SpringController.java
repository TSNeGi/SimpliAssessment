package io.spring.deployment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController 

public class SpringController {
	
	@RequestMapping("/")  
	public String welcome()   
	{  
	String print="Successfully build pipeline in Jenkins. \n Its AWS with jenkins."; 
	return print;
	}  
}
