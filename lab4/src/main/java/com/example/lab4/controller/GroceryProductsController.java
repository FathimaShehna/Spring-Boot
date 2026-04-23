package com.example.lab4.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.lab4.models.Products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class GroceryProductsController {
	
		@GetMapping("/single-product")
	    public String getProduct(Model model) {
			
			Products product = new Products (101,"Sugar",(float)55.5);
			model.addAttribute("product", product);
			return "product";
	    }
		
		@GetMapping("/product-list")
	    public String getProducts(Model model) {
			
			List<Products> products = new ArrayList<> ();
			products.add(new Products(101,"Sugar",(float)55.5));
			products.add(new Products(102,"Salt",(float)20.0));
			products.add(new Products(103,"Wheat Flour",(float)38.75));
			model.addAttribute("products", products);
			
			return "products";
	    }
		
		
	}