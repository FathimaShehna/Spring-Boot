package com.example.lab5.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class ProjectController {
	
		@GetMapping("/project")
	    public String welcome(Model model) {
			
			String welcome = "Welcome to My App";
			model.addAttribute("welcome", welcome);
			return "project";
			
			
	    }
		
	}