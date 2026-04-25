package com.example.lab7.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.lab7.Models.ProductsModel;

public interface ProductsRepository extends CrudRepository<ProductsModel,Integer> {

}