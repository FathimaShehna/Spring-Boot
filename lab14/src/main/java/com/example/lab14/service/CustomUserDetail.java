package com.example.lab14.service;

import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.lab14.model.User;


public class CustomUserDetail implements UserDetails {


    private User user;


    public CustomUserDetail(User user) {
        this.user = user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }


    public String getFirstName() {
        return user.getFirstName();
    }
    
    public String getLastName() {
        return user.getLastName();
    }
    

    public Integer getMobileNo() {
       
        return user.getMobileNo();
    }
    
    public String getEmail() {
        return user.getEmail();
    }


    @Override
    public String getPassword() {
        return user.getPassword();
    }



    @Override
    public boolean isAccountNonExpired() {
   
        return true;
    }


    @Override
    public boolean isAccountNonLocked() {
   
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
   
        return true;
    }


   @Override
   public boolean isEnabled() {
	   return true;
   }


   @Override
   public String getUsername() {
	// TODO Auto-generated method stub
	return user.getEmail();
   }
}