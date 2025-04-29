package com.example.teknologiinformasi.appointment_service.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import java.time.LocalDateTime;

public class CreateAppointmentCommand {

    @TargetAggregateIdentifier
    private String appointmentId;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;
    
    public CreateAppointmentCommand(String appointmentId, String patientName) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.appointmentDate = LocalDateTime.now();
        this.appointmentStatus = "SCHEDULED";
    }

    // getters (dan setters jika diperlukan)
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

