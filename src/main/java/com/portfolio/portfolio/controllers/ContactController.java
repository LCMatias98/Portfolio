package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.dtos.ContactDTO;
import com.portfolio.portfolio.models.Contact;
import com.portfolio.portfolio.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @PostMapping("/email")
    public ResponseEntity<?> sendEmail(@RequestBody ContactDTO contactDTO){

//        Contact contact = new Contact(contactDTO.getEmail(),contactDTO.getSubject(),contactDTO.getMessage());
//        contactService.saveContact(contact);
//        SimpleMailMessage email = new SimpleMailMessage();
//        email.setTo("correalucas@hotmail.com.ar");
//        email.setFrom("correalucas@hotmail.com.ar");
//        email.setSubject(contactDTO.getSubject());
//        email.setText(contactDTO.getMessage());
//        javaMailSender.send(email);

        return new ResponseEntity<>("Email sent successfully.", HttpStatus.CREATED);
    }
}
