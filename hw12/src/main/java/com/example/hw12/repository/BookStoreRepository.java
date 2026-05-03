package com.example.hw12.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.hw12.models.BookStore;

public interface BookStoreRepository extends JpaRepository<BookStore,Integer> {
	
	@Query("SELECT b FROM BookStore b WHERE b.title LIKE %:keyword%")
    List<BookStore> findAllByKeyword(@Param("keyword") String keyword);

}