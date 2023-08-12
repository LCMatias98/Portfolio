package com.portfolio.portfolio.dtos;

import com.portfolio.portfolio.models.Contact;

public class ContactDTO {

    private String subject;
    private String message;

    public ContactDTO(Contact contact) {
        this.subject = contact.getSubject();
        this.message = contact.getMessage();
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
