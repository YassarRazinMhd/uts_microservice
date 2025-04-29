package com.example.teknologiinformasi.appointment_service.model;

public class UpdateAppointmentRequest {
    private String patientName;
    private String appointmentStatus;

    // Getters & Setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }
}
