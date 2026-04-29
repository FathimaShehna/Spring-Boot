package com.example.lab9.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.lab9.models.StudentRecords;
import com.example.lab9.repository.StudentRepository;

import org.springframework.data.repository.query.Param;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/create")
    public String createAction(Model model) {
        model.addAttribute("message", "Enter Student Details");
        return "create";
    }

    @PostMapping("/create")
    public String createActionProcess(StudentRecords studentData, Model model) {
    	studentRepository.save(studentData);
        model.addAttribute("message", studentData.getName() + "'s details has been created successfully");
        return "create";
    }
    
    @GetMapping("/all")
    public String getAllStudents(Model model, @Param("keyword") String keyword) {
        List<StudentRecords> studentrecord;
        if (keyword != null && !keyword.isEmpty()) {
        	studentrecord = studentRepository.findAllByKeyword(keyword);
        } else {
        	studentrecord = studentRepository.findAll();
        }
        model.addAttribute("studentrecord", studentrecord);
        return "list";
    }
    
    @GetMapping("/update/{id}")
    public String updateRecord(@PathVariable Integer id, Model model) {
        Optional<StudentRecords> optionalStuDetails = studentRepository.findById(id);
        if (optionalStuDetails.isPresent()) {
            model.addAttribute("studentDetails", optionalStuDetails.get());
            return "update";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/update/{id}")
    public String updateRecord(@PathVariable Integer id, StudentRecords stuData) {
        Optional<StudentRecords> optionalStuDetails = studentRepository.findById(id);
        if (optionalStuDetails.isPresent()) {
        	StudentRecords studentDetails = optionalStuDetails.get();
        	studentDetails.setName(stuData.getName());
        	studentDetails.setStd(stuData.getStd());
        	studentDetails.setAge(stuData.getAge());
        	studentRepository.save(studentDetails);
        }
        return "redirect:/all";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteRecord(@PathVariable Integer id, Model model) {
        Optional<StudentRecords> optionalStuDetails = studentRepository.findById(id);
        if (optionalStuDetails.isPresent()) {
            model.addAttribute("studentDetails", optionalStuDetails.get());
            return "delete";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/delete/{id}")
    public String deleteRecord(@PathVariable Integer id) {
    	studentRepository.deleteById(id);
        return "redirect:/all";
    }
}