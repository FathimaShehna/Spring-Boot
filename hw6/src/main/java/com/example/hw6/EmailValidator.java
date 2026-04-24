package com.example.hw6;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.Email;

public class EmailValidator implements ConstraintValidator<GmailOnly, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
       // s = s.toLowerCase();
        boolean result = s.contains("@gmail.com");
        return result;
    }
}