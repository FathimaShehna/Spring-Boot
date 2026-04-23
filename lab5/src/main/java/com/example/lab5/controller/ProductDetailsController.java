package com.example.lab5.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class ProductDetailsController {
	
		@GetMapping("/productDetails")
	    public String product(Model model) {
			
			String product = "This is the product details page.";
			model.addAttribute("product", product);
			return "productDetails";
			
			
	    }
		
	}