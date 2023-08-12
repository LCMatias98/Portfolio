package com.portfolio.portfolio;

import com.portfolio.portfolio.models.Contact;
import com.portfolio.portfolio.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PortfolioApplication {

//	@Autowired
//	private PasswordEncoder passwordEnconder;
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ContactRepository contactRepository) {
		return (args) -> {

			Contact contact = new Contact("Mensaje Prueba","Creando datos de prueba");
			contactRepository.save(contact);
		};
	}

}
