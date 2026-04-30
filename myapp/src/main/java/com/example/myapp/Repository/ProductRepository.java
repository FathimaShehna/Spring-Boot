package com.example.myapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.myapp.Models.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
	
	@Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword%")
    List<Product> findAllByKeyword(@Param("keyword") String keyword);

}