package com.example.lab15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {

    @Autowired
    private JavaMailSender sender;

    @PostMapping("/sendEmail")
    @ResponseBody
    public String sendEmail() {
        try {
            
            // Prepare the email content
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo("receiver@mailtrap.io");  // Replace with your Mailtrap address or receiver's email
            msg.setSubject("Test Mail");
            msg.setText("This is a test mail" + "\n"+ "Checking for mail");

            // Send the email
            sender.send(msg);
            return "Successfully sent email";
        } catch (MailException ex) {
            System.err.println(ex.getMessage());
            return "Sending email failed";
        }
    }
    
    @GetMapping("/list")
    public String listEmail() {
		return "list";
    	
    }
}