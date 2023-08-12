package com.portfolio.portfolio.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") // strategia para generar pk auto
    @GenericGenerator(name = "native", strategy = "native") //strategia por defecto db
    private Long id;
    private String subject;
    private String message;

    public Contact() {
    }

    public Contact(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getId(), contact.getId()) && Objects.equals(getSubject(), contact.getSubject()) && Objects.equals(getMessage(), contact.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSubject(), getMessage());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
