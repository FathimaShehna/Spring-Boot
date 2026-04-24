package com.example.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	
	public class UserFormController {
		
		@GetMapping("/form")
		
		public String processForm(@RequestParam(required=false) String userName, Model model) {
			
			model.addAttribute("userName", userName);
			return "userForm";
		}
		
		@PostMapping("/submit")
		
		public String handleFormSubmission(@RequestParam String userName, Model model) {
			model.addAttribute("userName", userName);
			return "success";
		}
	}