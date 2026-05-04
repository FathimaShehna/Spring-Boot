package com.example.hw13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.hw13.dto.UserDto;
import com.example.hw13.dto.UserResponseDto;
import com.example.hw13.models.UserModel;
import com.example.hw13.repository.UserRepository;



@Service
public class UserService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepository userRepository;

 /*   public UserModel save(UserDto userDto) {
    	UserModel user = new UserModel(userDto.getFirstName(),userDto.getLastName(),userDto.getMobileNo(),userDto.getEmail(),passwordEncoder.encode(userDto.getPassword()),userDto.getGoals());
    	UserModel savedUser = userRepository.save(user);

        // Return only username + email
        
    } */
}