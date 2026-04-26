package com.example.hw7.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.hw7.repository.BookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.hw7.models.BookStore; 
@Controller
public class BookStoreController {

	@Autowired
    private BookRepository bookRepository;

    // Show form
    @GetMapping("/book-form")
    public String showForm(Model model) {
        model.addAttribute("book", new BookStore());
        return "bookForm";
    }

    // Save book
    @PostMapping("/save-book")
    public String saveBook(@ModelAttribute BookStore book) {
    	bookRepository.save(book);
        return "redirect:/books";
    }

    // Show all books
    @GetMapping("/books")
    public String showBooks(Model model) {
        List<BookStore> list = (List<BookStore>) bookRepository.findAll();
        model.addAttribute("books", list);
        return "bookList";
    }

}