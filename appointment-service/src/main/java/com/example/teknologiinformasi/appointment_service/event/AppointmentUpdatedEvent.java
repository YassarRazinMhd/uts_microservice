package com.example.teknologiinformasi.appointment_service.event;

import java.time.LocalDateTime;

public class AppointmentUpdatedEvent {
    private String appointmentId;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;

    public AppointmentUpdatedEvent(String appointmentId, String patientName, LocalDateTime appointmentDate, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    // Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }
}
