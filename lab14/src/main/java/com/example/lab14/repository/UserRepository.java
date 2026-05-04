package com.example.lab14.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab14.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByToken(String token);
    boolean existsByToken(String token);
	
	
}