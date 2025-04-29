package com.example.teknologiinformasi.appointment_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment_summary")
public class AppointmentSummary {

    @Id
    private String Id;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;
   

    public AppointmentSummary() {}

    public AppointmentSummary(String Id, String patientName, LocalDateTime appointmentDate, String appointmentStatus) {
        this.Id = Id;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    // Getters & Setters
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }
}

