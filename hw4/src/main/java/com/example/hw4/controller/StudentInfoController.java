package com.example.hw4.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.hw4.models.Students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


	@Controller   
	
	public class StudentInfoController {
	
		@GetMapping("/student-info")
	    public String getStuInfo(Model model) {
			
			Students student = new Students (101,"Anjali Sharma",(float)92.5);
			model.addAttribute("student", student);
			return "studentInfo";
	    }
		
		@GetMapping("/student-list")
	    public String getStudentsInfo(Model model) {
			
			List<Students> students = new ArrayList<> ();
			students.add(new Students(101,"Anjali Sharma",(float)92.5));
			students.add(new Students(102,"Rohit Mehta",(float)85.0));
			students.add(new Students(103,"Sneha Iyer",(float)78.6));
			model.addAttribute("students", students);
			
			return "students";
	    }
		
		
	}