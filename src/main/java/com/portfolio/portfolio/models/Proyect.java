package com.portfolio.portfolio.models;

import com.portfolio.portfolio.dtos.enums.StatusProyect;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Proyect {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") // strategia para generar pk auto
    @GenericGenerator(name = "native", strategy = "native") //strategia por defecto
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

    public Proyect() {
    }

    public Proyect(String name, String description, String images, List<String> technologiesUsed, String repositoryUrl, String liveHost, LocalDate startDate, LocalDate endDate, StatusProyect statusProyect) {
        this.name = name;
        this.description = description;
        this.images = images;
        this.technologiesUsed = technologiesUsed;
        this.repositoryUrl = repositoryUrl;
        this.liveHost = liveHost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.statusProyect = statusProyect;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public List<String> getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(List<String> technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getLiveHost() {
        return liveHost;
    }

    public void setLiveHost(String liveHost) {
        this.liveHost = liveHost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public StatusProyect getStatusProyect() {
        return statusProyect;
    }

    public void setStatusProyect(StatusProyect statusProyect) {
        this.statusProyect = statusProyect;
    }
}
