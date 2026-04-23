package com.example.hw3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class MovieReviewController {
	
		@GetMapping("/movie")
	    public String movie(Model model) {
			
			String title = "Inception";
			model.addAttribute("title", title);
			
			String shortDesc = "A skilled thief enters people’s dreams to steal secrets, but ...";
			model.addAttribute("shortDesc", shortDesc);
			
			String fullDesc = "A skilled thief enters people’s dreams to steal secrets, but his next mission is to plant an idea instead. As reality and illusion blur, he must face his past to complete the job.";
			model.addAttribute("fullDesc", fullDesc);
			
			boolean isLoggedIn = true;
			model.addAttribute("isLoggedIn", isLoggedIn);
			
			String message = "Please log in to read the full movie description.";
			model.addAttribute("message", message);
			
	        return "movieReview";
	    }
	}