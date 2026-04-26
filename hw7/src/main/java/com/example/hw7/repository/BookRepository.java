package com.example.hw7.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.hw7.models.BookStore;

public interface BookRepository extends CrudRepository<BookStore,Integer> {

}