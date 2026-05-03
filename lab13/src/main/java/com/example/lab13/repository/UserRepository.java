package com.example.lab13.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab13.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
   // User findByEmail(String email);
}