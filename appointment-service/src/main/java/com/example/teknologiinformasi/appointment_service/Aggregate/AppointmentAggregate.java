package com.example.teknologiinformasi.appointment_service.Aggregate;

import java.time.LocalDateTime;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.example.teknologiinformasi.appointment_service.command.CreateAppointmentCommand;
import com.example.teknologiinformasi.appointment_service.command.UpdateAppointmentCommand;
import com.example.teknologiinformasi.appointment_service.event.AppointmentCreatedEvent;
import com.example.teknologiinformasi.appointment_service.event.AppointmentUpdatedEvent;

@Aggregate
public class AppointmentAggregate {

    @AggregateIdentifier
    private String appointmentId;
    private String patientName;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;

    public String getPatientName() {
        return patientName;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    // Konstruktor kosong wajib untuk Axon
    public AppointmentAggregate() {}

    @CommandHandler
    public AppointmentAggregate(CreateAppointmentCommand command) {
        // Validasi command kalau perlu

        // Terapkan event AppointmentCreatedEvent
        AggregateLifecycle.apply(new AppointmentCreatedEvent(
                command.getAppointmentId(),
                command.getPatientName(),
                command.getAppointmentDate(),
                command.getAppointmentStatus()
        ));
    }

    @EventSourcingHandler
    protected void on(AppointmentCreatedEvent event) {
        this.appointmentId = event.getAppointmentId();
        this.patientName = event.getPatientName();
        this.appointmentDate = event.getAppointmentDate();
        this.appointmentStatus = event.getAppointmentStatus();
    }

    @CommandHandler
    public void handle(UpdateAppointmentCommand command) {
        AggregateLifecycle.apply(new AppointmentUpdatedEvent(
                command.getAppointmentId(),
                command.getpatientName(),
                command.getAppointmentDate(),
                command.getAppointmentStatus()
        ));
    }

    @EventSourcingHandler
    protected void on(AppointmentUpdatedEvent event) {
        this.patientName = event.getPatientName();
        this.appointmentDate = event.getAppointmentDate();
        this.appointmentStatus = event.getAppointmentStatus();
    }
}

