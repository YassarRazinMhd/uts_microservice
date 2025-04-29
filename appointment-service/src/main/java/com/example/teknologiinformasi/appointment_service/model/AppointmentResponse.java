package com.example.teknologiinformasi.appointment_service.model;

import com.example.teknologiinformasi.appointment_service.model.Appointment;
import com.example.teknologiinformasi.appointment_service.model.Patient;

public class AppointmentResponse {
    private Appointment appointment;
    private Patient patient;

    public AppointmentResponse() {}

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}