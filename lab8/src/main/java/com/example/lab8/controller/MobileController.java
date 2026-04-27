package com.example.lab8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.lab8.models.MobilePhones;
import com.example.lab8.repository.MobileRepository;

@Controller

public class MobileController{
	
	 @Autowired
	    private MobileRepository mobileRepository;
	 
	// Show form
	    @GetMapping("/mobile-form")
	    public String showForm(Model model) {
	        model.addAttribute("mobile", new MobilePhones());
	        return "mobileForm";
	    }

	    // Save product
	    @PostMapping("/save-mobile")
	    public String saveMobile(@ModelAttribute MobilePhones mobile) {
	    	mobileRepository.save(mobile);
	        return "redirect:/mobiles";
	    }

	    // Show all products
	    @GetMapping("/mobiles")
	    public String showMobiles(Model model) {
	        List<MobilePhones> list = (List<MobilePhones>) mobileRepository.findAll();
	        model.addAttribute("mobiles", list);
	        return "mobileList";
	    }

		@GetMapping("/mobiles/mobilesByPrice")
		
		public String mobilesByPrice(Model model) {
			
			List<MobilePhones> mobileList = mobileRepository.findByPrice();
		    model.addAttribute("mobileList", mobileList);
		    return "mobile-price";
		      
		}
		
		@GetMapping("/mobiles/mobilesByPrice/mobilesByType")
		
		public String mobilesCount(Model model) {
			
			List<Object[]> mobileList = mobileRepository.findCountByType();
		    model.addAttribute("mobileList", mobileList);
		    return "mobile-type";
		      
		}
	
	
}