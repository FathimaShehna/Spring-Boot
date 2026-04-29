package com.example.lab11.dto;

public class UserDto {
   
    private Integer phnum;
    private String password;
    private String username;
   
    public UserDto(Integer phnum, String password, String username) {
        super();
        this.phnum = phnum;
        this.password = password;
        this.username = username;
    }

    public Integer getPhnum() {
        return phnum;
    }

    public void setPhnum(Integer phnum) {
        this.phnum = phnum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setgetUsername(String username) {
        this.username = username;
    }
   
}