package com.example.hw5.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class HomeController {
	
		@GetMapping("/home")
	    public String home(Model model) {
			
			String welcome = "Welcome to our Book store";
			model.addAttribute("welcome", welcome);
			return "home";
			
			
	    }
		
	}