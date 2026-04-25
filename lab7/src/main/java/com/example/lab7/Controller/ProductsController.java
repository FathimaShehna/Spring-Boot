package com.example.lab7.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.lab7.Repository.ProductsRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import com.example.lab7.Models.ProductsModel; 
@Controller
public class ProductsController {

    @Autowired
    private ProductsRepository productRepository;

    // Show form
    @GetMapping("/product-form")
    public String showForm(Model model) {
        model.addAttribute("product", new ProductsModel());
        return "productForm";
    }

    // Save product
    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute ProductsModel product) {
        productRepository.save(product);
        return "redirect:/products";
    }

    // Show all products
    @GetMapping("/products")
    public String showProducts(Model model) {
        List<ProductsModel> list = (List<ProductsModel>) productRepository.findAll();
        model.addAttribute("products", list);
        return "productList";
    }
}