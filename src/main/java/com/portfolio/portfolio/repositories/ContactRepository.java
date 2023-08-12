package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContactRepository extends JpaRepository<Contact,Long> {
}
