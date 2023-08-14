package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProyectRepository extends JpaRepository<Proyect,Long> {
}
