package com.example.hw10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.hw10.dto.LibraryDto;
import com.example.hw10.models.Library;
import com.example.hw10.repository.LibraryRepository;

@Service
public class LibraryService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private LibraryRepository libraryRepository;

    public Library save(LibraryDto libraryDto) {
    	Library library = new Library(libraryDto.getName(), passwordEncoder.encode(libraryDto.getPassword()) , libraryDto.getEmail(), libraryDto.getDob(),libraryDto.getAddress());
        return libraryRepository.save(library);
    }
}