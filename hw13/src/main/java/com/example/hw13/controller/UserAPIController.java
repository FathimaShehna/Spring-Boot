package com.example.hw13.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hw13.dto.UserDto;
import com.example.hw13.dto.UserResponseDto;
import com.example.hw13.models.UserModel;
import com.example.hw13.repository.UserRepository;
import com.example.hw13.service.UserService;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3002")
public class UserAPIController {


	    @Autowired
	    private UserRepository userRepository;
	    
	    @Autowired
	    private UserService userService;
	    
	    @Autowired
	    private PasswordEncoder passwordEncoder;


	    @PostMapping("api/adduser")
	    UserModel newUser(@RequestBody UserModel newUser) {
	        return userRepository.save(newUser);
	    }


	    @GetMapping("api/listusers")
	    List<UserModel> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @PostMapping("/register")
	    public ResponseEntity<?> register(@RequestBody UserModel user) {
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        userRepository.save(user);
	        return ResponseEntity.ok(user.getFirstName()+" "+user.getEmail());
	    }
	}
