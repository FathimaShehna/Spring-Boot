package com.example.lab10.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab10.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}