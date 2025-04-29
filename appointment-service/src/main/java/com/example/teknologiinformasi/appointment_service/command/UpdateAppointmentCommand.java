package com.example.teknologiinformasi.appointment_service.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import java.time.LocalDateTime;

public class UpdateAppointmentCommand {

    @TargetAggregateIdentifier
    private String appointmentId;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;

    public UpdateAppointmentCommand(String appointmentId, String PatientName, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.patientName = PatientName;
        // setiap kali di-update, kita set ulang timestamp
        this.appointmentDate = LocalDateTime.now();
        this.appointmentStatus = appointmentStatus;
    }

    // Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public String getpatientName() {
        return patientName;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }
}
