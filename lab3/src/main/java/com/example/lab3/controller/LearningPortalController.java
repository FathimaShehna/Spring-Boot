package com.example.lab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class LearningPortalController {
	
		@GetMapping("/home")
	    public String welcome(Model model) {
			
			String message = "The beautiful thing about learning is that no one can take it away from you.";
			model.addAttribute("message", message);
			
			String hello = "<h1>Hello from Spring Boot!</h1>";
			model.addAttribute("hello", hello);
			
			boolean isLoggedIn = true;
			model.addAttribute("isLoggedIn", isLoggedIn);
			
	        return "learningPortal";
	    }
	}