package com.example.teknologiinformasi.doctor_service.event;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AppointmentCreatedEvent implements Serializable {

    private Long id;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus; // contoh: CREATED, CONFIRMED, CANCELLED

    public AppointmentCreatedEvent() {
    }

    public AppointmentCreatedEvent(Long id, String patientName, LocalDateTime appointmentDate, String appointmentStatus) {
        this.id = id;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "AppointmentCreatedEvent{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentStatus='" + appointmentStatus + '\'' +
                '}';
    }
}