package com.example.hw2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


	@Controller   
	
	public class PhotographyController {
	
		@GetMapping("/start")
	    public String home() {
	        return "redirect:/welcome";
	    }//generate a redirect response to the URL "/welcome"
		
	    @GetMapping("/welcome")
	    public String hello() {
	        return "photography";
	    }
	}