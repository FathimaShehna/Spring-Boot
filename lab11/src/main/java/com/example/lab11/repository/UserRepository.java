package com.example.lab11.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab11.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}