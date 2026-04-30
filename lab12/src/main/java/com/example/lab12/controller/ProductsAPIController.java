package com.example.lab12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab12.Models.Products;
import com.example.lab12.exception.ProductNotFoundException;
import com.example.lab12.repository.ProductsRepository;

@RestController
@CrossOrigin("http://localhost:3002")
public class ProductsAPIController {


	    @Autowired
	    private ProductsRepository productsRepository;


	    @PostMapping("api/addproduct")
	    Products newProduct(@RequestBody Products newProduct) {
	        return productsRepository.save(newProduct);
	    }


	    @GetMapping("api/listproduct")
	    List<Products> getAllProducts() {
	        return productsRepository.findAll();
	    }


	    @GetMapping("api/product/{id}")
	    Products getProductById(@PathVariable Integer id) {
	        return productsRepository.findById(id)
	                .orElseThrow(() -> new ProductNotFoundException(id));
	    }


	    @PutMapping("api/updateproduct/{id}")
	    Products updateProduct(@RequestBody Products newProduct, @PathVariable Integer id) {
	        return productsRepository.findById(id)
	                .map(product -> {
	                    product.setName(newProduct.getName());
	                    product.setDescription(newProduct.getDescription());
	                    product.setPrice(newProduct.getPrice());
	                    product.setExpiryDate(newProduct.getExpiryDate());
	                    product.setCategory(newProduct.getCategory());
	                    product.setStock(newProduct.getStock());
	                    
	                    return productsRepository.save(product);
	                }).orElseThrow(() -> new ProductNotFoundException(id));
	    }

	    @DeleteMapping("api/deleteproduct/{id}")
	    String deleteProduct(@PathVariable Integer id){
	        if(!productsRepository.existsById(id)){
	            throw new ProductNotFoundException(id);
	        }
	        productsRepository.deleteById(id);
	        return  "Product with id "+id+" has been deleted success.";
	    }
	    
	     @GetMapping("api/search")
	        List<Products> searchProducts(@Param("keyword") String keyword) {
	            return productsRepository.findAllByKeyword(keyword);
	        }
	}
