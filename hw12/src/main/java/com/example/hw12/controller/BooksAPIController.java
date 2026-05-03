package com.example.hw12.controller;

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

import com.example.hw12.exception.BookNotFoundException;
import com.example.hw12.models.BookStore;
import com.example.hw12.repository.BookStoreRepository;

@RestController
@CrossOrigin("http://localhost:3002")
public class BooksAPIController {


	    @Autowired
	    private BookStoreRepository booksRepository;


	    @PostMapping("api/addbook")
	    BookStore newBook(@RequestBody BookStore newBook) {
	        return booksRepository.save(newBook);
	    }


	    @GetMapping("api/listbooks")
	    List<BookStore> getAllBooks() {
	        return booksRepository.findAll();
	    }


	    @GetMapping("api/book/{id}")
	    BookStore getBookById(@PathVariable Integer id) {
	        return booksRepository.findById(id)
	                .orElseThrow(() -> new BookNotFoundException(id));
	    }


	    @PutMapping("api/updatebook/{id}")
	    BookStore updateBook(@RequestBody BookStore newBook, @PathVariable Integer id) {
	        return booksRepository.findById(id)
	                .map(book -> {
	                	book.setTitle(newBook.getTitle());
	                	book.setAuthor(newBook.getAuthor());
	                	book.setPrice(newBook.getPrice());
	                	book.setGenre(newBook.getGenre());
	                	book.setPublishedDate(newBook.getPublishedDate());
	                    
	                    return booksRepository.save(book);
	                }).orElseThrow(() -> new BookNotFoundException(id));
	    }

	    @DeleteMapping("api/deletebook/{id}")
	    String deletebook(@PathVariable Integer id){
	        if(!booksRepository.existsById(id)){
	            throw new BookNotFoundException(id);
	        }
	        booksRepository.deleteById(id);
	        return  "Book with id "+id+" has been deleted success.";
	    }
	    
	     @GetMapping("api/search")
	        List<BookStore> searchBooks(@Param("keyword") String keyword) {
	            return booksRepository.findAllByKeyword(keyword);
	        }
	}
