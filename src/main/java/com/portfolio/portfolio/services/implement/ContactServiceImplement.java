package com.portfolio.portfolio.services.implement;

import com.portfolio.portfolio.models.Contact;
import com.portfolio.portfolio.repositories.ContactRepository;
import com.portfolio.portfolio.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImplement implements ContactService {

    @Autowired
    private ContactRepository contactRepository;
    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }
}
