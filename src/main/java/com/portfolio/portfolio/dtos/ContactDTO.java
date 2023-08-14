package com.portfolio.portfolio.dtos;

import com.portfolio.portfolio.models.Contact;

public class ContactDTO {

    private String email;
    private String subject;
    private String message;

    public ContactDTO(Contact contact) {
        this.email = contact.getEmail();
        this.subject = contact.getSubject();
        this.message = contact.getMessage();
    }
    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
