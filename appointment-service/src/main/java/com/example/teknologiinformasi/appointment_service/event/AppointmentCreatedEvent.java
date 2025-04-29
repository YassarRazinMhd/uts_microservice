package com.example.teknologiinformasi.appointment_service.event;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AppointmentCreatedEvent implements Serializable {
    private String appointmentId;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;

    public AppointmentCreatedEvent() {}

    public AppointmentCreatedEvent(String appointmentId, String patientName, LocalDateTime appointmentDate, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
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
               "appointmentId='" + appointmentId + '\'' +
               ", patientName='" + patientName + '\'' +
               ", appointmentDate=" + appointmentDate +
               ", appointmentStatus='" + appointmentStatus + '\'' +
               '}';
    }
}
