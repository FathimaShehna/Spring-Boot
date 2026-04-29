package com.example.lab11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.lab11.dto.UserDto;
import com.example.lab11.models.User;
import com.example.lab11.repository.UserRepository;

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