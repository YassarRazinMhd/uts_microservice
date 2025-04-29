package com.example.teknologiinformasi.doctor_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String description;
    private boolean available;

    // no-arg constructor
    public Doctor() {}

    // all-arg constructor (except id)
    public Doctor(String name, String specialization, String description, boolean available) {
        this.name = name;
        this.specialization = specialization;
        this.description = description;
        this.available = available;
    }

    // getters & setters

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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Doctor{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", specialization='" + specialization + '\'' +
               ", description='" + description + '\'' +
               ", available=" + available +
               '}';
    }
}
