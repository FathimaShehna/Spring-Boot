package com.example.hw6;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDetails{
	 
	 @NotBlank(message = "Name is Required")
	 public String name;
	 
	 @Email(message = "Email address is not valid")
	 @NotBlank(message = "Email is Required")
	 @GmailOnly(message = "Email must contain @gmail.com.")
	 public String email;
	 
	 @NotBlank(message = "Address is Required")
	 @Address(message = "Address must include the word India")
	 public String address;
	 
	 public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getAddress() {
	        return address;
	    }
	    
	    public void setAddress(String address) {
	    	this.address=address;
	    }
 }