package com.portfolio.portfolio.services;

import com.portfolio.portfolio.dtos.ProyectDTO;
import com.portfolio.portfolio.models.Proyect;

import java.util.List;

public interface ProyectService {

    List<Proyect> getProyects();
    void saveProyect(Proyect proyect);
    Proyect findById(Long id);
}
