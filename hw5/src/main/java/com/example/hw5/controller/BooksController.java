package com.example.hw5.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.hw5.models.BooksPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class BooksController {
	
		@GetMapping("/books")
	    public String booksPage(Model model) {
			
			BooksPage books = new BooksPage("The Alchemist","Paulo Coelho",(float)299);
			model.addAttribute("books", books);
			return "books";
			
			
	    }
		
	}