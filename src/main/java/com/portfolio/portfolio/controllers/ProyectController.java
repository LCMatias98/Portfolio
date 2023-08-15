package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.dtos.ContactDTO;
import com.portfolio.portfolio.dtos.ProyectDTO;
import com.portfolio.portfolio.models.Proyect;
import com.portfolio.portfolio.services.ContactService;
import com.portfolio.portfolio.services.ProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProyectController {

    @Autowired
    private ProyectService proyectService;

    @GetMapping("/readProyects")
    public List<Proyect> getAllProyects(){
        return proyectService.getProyects();
    }

    //    no voy a eliminar proyectos
    @PostMapping("/createProyect")
    public ResponseEntity<?> createProyect(@RequestBody ProyectDTO proyectDTO){

        if(proyectDTO.getName().isBlank()){
            return new ResponseEntity<>("Please add a name to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getDescription().isBlank()){
            return new ResponseEntity<>("Please add a description to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getImages().isBlank()){
            return new ResponseEntity<>("Please add images to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getTechnologiesUsed().isEmpty()){
            return new ResponseEntity<>("Please add technologies used in the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getRepositoryUrl().isBlank()){
            return new ResponseEntity<>("Please add a repository URL to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getLiveHost().isBlank()){
            return new ResponseEntity<>("Please add a live host URL to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getStartDate() == null){
            return new ResponseEntity<>("Please add a start date to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getEndDate() == null){
            return new ResponseEntity<>("Please add an end date to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getStatusProyect() == null){
            return new ResponseEntity<>("Please add a status to the project", HttpStatus.FORBIDDEN);
        }

        Proyect proyectToCreate = new Proyect(proyectDTO.getName(),proyectDTO.getDescription(),proyectDTO.getImages(),proyectDTO.getTechnologiesUsed(),proyectDTO.getRepositoryUrl(),proyectDTO.getLiveHost(),proyectDTO.getStartDate(),proyectDTO.getEndDate(),proyectDTO.getStatusProyect());
        proyectService.saveProyect(proyectToCreate);

        return new ResponseEntity<>("Proyect created successfully.", HttpStatus.CREATED);
    }

    @PatchMapping("/updateProyect")
    public ResponseEntity<?> updateProyect(@RequestBody ProyectDTO proyectDTO){

        if(proyectDTO.getName().isBlank()){
            return new ResponseEntity<>("Please add a name to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getDescription().isBlank()){
            return new ResponseEntity<>("Please add a description to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getImages().isBlank()){
            return new ResponseEntity<>("Please add images to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getTechnologiesUsed().isEmpty()){
            return new ResponseEntity<>("Please add technologies used in the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getRepositoryUrl().isBlank()){
            return new ResponseEntity<>("Please add a repository URL to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getLiveHost().isBlank()){
            return new ResponseEntity<>("Please add a live host URL to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getStartDate() == null){
            return new ResponseEntity<>("Please add a start date to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getEndDate() == null){
            return new ResponseEntity<>("Please add an end date to the project", HttpStatus.FORBIDDEN);
        }
        if(proyectDTO.getStatusProyect() == null){
            return new ResponseEntity<>("Please add a status to the project", HttpStatus.FORBIDDEN);
        }

        Proyect proyectToUpdate = proyectService.findById(proyectDTO.getId());

        proyectToUpdate.setName(proyectDTO.getName());
        proyectToUpdate.setDescription(proyectDTO.getDescription());
        proyectToUpdate.setImages(proyectToUpdate.getImages());

        proyectToUpdate.setTechnologiesUsed(proyectDTO.getTechnologiesUsed());
        proyectToUpdate.setRepositoryUrl(proyectDTO.getRepositoryUrl());
        proyectToUpdate.setLiveHost(proyectDTO.getLiveHost());

        proyectToUpdate.setStartDate(proyectDTO.getStartDate());
        proyectToUpdate.setEndDate(proyectDTO.getEndDate());
        proyectToUpdate.setStatusProyect(proyectDTO.getStatusProyect());
        proyectService.saveProyect(proyectToUpdate);

        return new ResponseEntity<>("Email sent successfully.", HttpStatus.CREATED);
    }


}
