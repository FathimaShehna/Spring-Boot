package com.example.hw13.dto;

public class UserResponseDto {

    private String firstName;
    private String email;

    public UserResponseDto(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
}