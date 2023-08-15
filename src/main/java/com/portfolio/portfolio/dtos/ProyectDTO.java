package com.portfolio.portfolio.dtos;

import com.portfolio.portfolio.dtos.enums.StatusProyect;
import com.portfolio.portfolio.models.Proyect;

import javax.persistence.ElementCollection;
import java.time.LocalDate;
import java.util.List;

public class ProyectDTO {

    private Long id;
    private String name;
    private String description;
    private String images;
    @ElementCollection
    private List<String> technologiesUsed;
    private String repositoryUrl;
    private String liveHost;
    private LocalDate startDate;
    private LocalDate endDate;
    private StatusProyect statusProyect;

    //Para leer loco
    public ProyectDTO() {
    }

    public ProyectDTO(Proyect proyect){
        this.id = proyect.getId();
        this.name = proyect.getName();
        this.description = proyect.getDescription();
        this.images = proyect.getImages();
        this.technologiesUsed = proyect.getTechnologiesUsed();
        this.repositoryUrl = proyect.getRepositoryUrl();
        this.liveHost = proyect.getLiveHost();
        this.startDate = proyect.getStartDate();
        this.endDate = proyect.getEndDate();
        this.statusProyect = proyect.getStatusProyect();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImages() {
        return images;
    }

    public List<String> getTechnologiesUsed() {
        return technologiesUsed;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public String getLiveHost() {
        return liveHost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public StatusProyect getStatusProyect() {
        return statusProyect;
    }
}
