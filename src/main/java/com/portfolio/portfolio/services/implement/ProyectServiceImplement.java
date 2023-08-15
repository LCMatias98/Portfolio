package com.portfolio.portfolio.services.implement;

import com.portfolio.portfolio.dtos.ProyectDTO;
import com.portfolio.portfolio.models.Proyect;
import com.portfolio.portfolio.repositories.ProyectRepository;
import com.portfolio.portfolio.services.ProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProyectServiceImplement implements ProyectService {

    @Autowired
    private ProyectRepository proyectRepository;


    @Override
    public List<Proyect> getProyects() {
        return proyectRepository.findAll();
    }

    @Override
    public void saveProyect(Proyect proyect) {
        proyectRepository.save(proyect);
    }

    @Override
    public Proyect findById(Long id) {
        return proyectRepository.findById(id).orElse(null);
    }
}
