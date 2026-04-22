package com.example.lab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


	@Controller   
	
	public class PortfolioController {
	
		@GetMapping("/start")
	    public String home() {
	        return "redirect:/portfolio";
	    }//generate a redirect response to the URL "/portfolio"
		
	    @GetMapping("/portfolio")
	    public String hello() {
	        return "portfolio";
	    }
	}