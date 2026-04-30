package com.example.myapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.myapp.Models.User;
import com.example.myapp.Repository.UserRepository;
import com.example.myapp.dto.UserDto;

@Service
public class UserService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepository userRepository;

    public User save(UserDto userDto) {
        User user = new User(userDto.getPhnum(), passwordEncoder.encode(userDto.getPassword()) , userDto.getUsername());
        return userRepository.save(user);
    }
}