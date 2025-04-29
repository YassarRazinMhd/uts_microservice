package com.example.teknologiinformasi.appointment_service.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teknologiinformasi.appointment_service.model.Appointment;
import com.example.teknologiinformasi.appointment_service.model.AppointmentSummary;

@Repository
public interface AppointmentSummaryRepository extends JpaRepository<AppointmentSummary, String> {
}
