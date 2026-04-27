package com.example.hw8.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.hw8.models.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant,Integer> {

    
}