package com.example.hw10.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hw10.models.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {
    Library findByName(String name);
}