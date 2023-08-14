package com.portfolio.portfolio.services.implement;

import com.portfolio.portfolio.models.Proyect;
import com.portfolio.portfolio.repositories.ProyectRepository;
import com.portfolio.portfolio.services.ProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectServiceImplement implements ProyectService {

    @Autowired
    private ProyectRepository proyectRepository;


    @Override
    public void saveProyect(Proyect proyect) {
        proyectRepository.save(proyect);
    }
}
