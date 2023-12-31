package com.portfolio.portfolio;

import com.portfolio.portfolio.dtos.enums.StatusProyect;
import com.portfolio.portfolio.models.Contact;
import com.portfolio.portfolio.models.Proyect;
import com.portfolio.portfolio.models.Client;
import com.portfolio.portfolio.repositories.ContactRepository;
import com.portfolio.portfolio.repositories.ProyectRepository;
import com.portfolio.portfolio.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class PortfolioApplication {

	@Autowired
	private PasswordEncoder passwordEnconder;
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ContactRepository contactRepository, ProyectRepository proyectRepository, ClientRepository clientRepository) {
		return (args) -> {

			String password1 = "rociorocio";
			String encodedPassword1 = this.passwordEnconder.encode(password1);
			Client userAdmin = new Client("admin@admin",encodedPassword1);
			clientRepository.save(userAdmin);

			Contact contact = new Contact("correalucasmatias98@gmail.com","Mensaje Prueba","Creando datos de prueba");
			contactRepository.save(contact);


			List<String> list1 = List.of("Java","Spring","HTML 5","CSS 3","Vue.js");
			Proyect proyect = new Proyect("Proyecto Prueba","Descripcion","url_de_img",list1,"url_repository","url_live_Host", LocalDate.now(),LocalDate.now().plusDays(1), StatusProyect.COMPLETED);
			proyectRepository.save(proyect);
		};
	}

}
