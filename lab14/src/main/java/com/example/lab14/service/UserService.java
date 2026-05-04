package com.example.lab14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.lab14.dto.UserDto;
import com.example.lab14.model.User;
import com.example.lab14.repository.UserRepository;


@Service
public class UserService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepository userRepository;

    public User save(UserDto userDto) {
        User user = new User(userDto.getFirstName(),userDto.getLastName(),userDto.getMobileNo(),userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user);
    }
}