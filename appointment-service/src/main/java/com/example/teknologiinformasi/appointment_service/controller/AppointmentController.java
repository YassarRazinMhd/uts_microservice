package com.example.teknologiinformasi.appointment_service.controller;

import com.example.teknologiinformasi.appointment_service.command.CreateAppointmentCommand;
import com.example.teknologiinformasi.appointment_service.command.UpdateAppointmentCommand;
import com.example.teknologiinformasi.appointment_service.model.CreateAppointmentRequest;
import com.example.teknologiinformasi.appointment_service.model.UpdateAppointmentRequest;
import com.example.teknologiinformasi.appointment_service.repository.AppointmentSummaryRepository;

import java.util.UUID;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final CommandGateway commandGateway;
    private final AppointmentSummaryRepository appointmentSummaryRepository;

    @Autowired
    public AppointmentController(CommandGateway commandGateway,
                                 AppointmentSummaryRepository appointmentSummaryRepository) {
        this.commandGateway = commandGateway;
        this.appointmentSummaryRepository = appointmentSummaryRepository;
    }

    // Endpoint untuk membuat appointment (Command)
    @PostMapping
    public String createAppointment(@RequestBody CreateAppointmentRequest request) {
        String appointmentId = UUID.randomUUID().toString();
        CreateAppointmentCommand command =
                new CreateAppointmentCommand(
                        appointmentId,
                        request.getPatientName()
                );
        commandGateway.sendAndWait(command);
        // Anda bisa menggunakan appointmentSummaryRepository untuk fetch atau verifikasi jika diperlukan
        return appointmentId;
    }

    // Endpoint untuk memperbarui appointment (Command)
    @PutMapping("/{appointmentId}")
    public String updateAppointment(
            @PathVariable String appointmentId,
            @RequestBody UpdateAppointmentRequest request
    ) {
        UpdateAppointmentCommand command =
                new UpdateAppointmentCommand(
                        appointmentId,
                        request.getPatientName(),
                        request.getAppointmentStatus()
                );
        commandGateway.sendAndWait(command);
        return appointmentId;
    }
}

