package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Value("${welcome.message}")
	private String message;
	
	public WelcomeController( String message) {
		super();
		this.message = message;
	}
	
	public WelcomeController( ) {
	}
	
	
	@GetMapping("/")
	public String welcome() {
		return message;
	}

}
