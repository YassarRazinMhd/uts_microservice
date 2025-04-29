package com.example.teknologiinformasi.appointment_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String medicalHistory;  
    private String dateOfBirth;    
    private boolean isActive;      

    // Konstruktor tanpa argumen
    public Patient() {}

    // Konstruktor dengan semua argumen (kecuali id)
    public Patient(String name, String medicalHistory, String dateOfBirth, boolean isActive) {
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.dateOfBirth = dateOfBirth;
        this.isActive = isActive;
    }

    // Getter & Setter

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

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Patient{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", medicalHistory='" + medicalHistory + '\'' +
               ", dateOfBirth='" + dateOfBirth + '\'' +
               ", isActive=" + isActive +
               '}';
    }
}