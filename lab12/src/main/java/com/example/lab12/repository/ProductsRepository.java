package com.example.lab12.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.lab12.Models.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
	
	@Query("SELECT p FROM Products p WHERE p.name LIKE %:keyword%")
    List<Products> findAllByKeyword(@Param("keyword") String keyword);

}