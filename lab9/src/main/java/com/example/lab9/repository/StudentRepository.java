package com.example.lab9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.lab9.models.StudentRecords;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentRecords, Integer> {
	
	@Query("SELECT s FROM StudentRecords s WHERE s.name LIKE %:keyword%")
    List<StudentRecords> findAllByKeyword(@Param("keyword") String keyword);
}