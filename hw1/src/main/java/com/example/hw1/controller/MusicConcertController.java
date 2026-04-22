package com.example.hw1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


	@Controller   
	
	public class MusicConcertController {
	
	    @GetMapping("/concert")    
	    public String hello() {
	        return "MusicConcert";   
	    }
	}