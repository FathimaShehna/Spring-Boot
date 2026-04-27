package com.example.hw8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.hw8.models.Restaurant;
import com.example.hw8.repository.RestaurantRepository;

@Controller

public class RestaurantController{
	
	@Autowired
    private RestaurantRepository restaurantRepository;
	
	@GetMapping("/dish/{name}/{price}")
	public String getDishDetails(@PathVariable String name, @PathVariable Float price, Model model) {
		System.out.println(name);
		System.out.println(price);
		Restaurant restaurant = new Restaurant();
		restaurant.setName(name);
		restaurant.setPrice(price);
	   model.addAttribute("restaurant", restaurant);
	   return "dish-details";
	}
}