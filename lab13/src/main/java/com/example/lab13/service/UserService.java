package com.example.lab13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.lab13.dto.UserDto;
import com.example.lab13.models.User;
import com.example.lab13.repository.UserRepository;


@Service
public class UserService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepository userRepository;

    public User save(UserDto userDto) {
        User user = new User(userDto.getName(),userDto.getEmail(),passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user);
    }
}