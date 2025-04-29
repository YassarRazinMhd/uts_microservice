package com.example.teknologiinformasi.patient_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teknologiinformasi.patient_service.model.Patient;
import com.example.teknologiinformasi.patient_service.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getById(Long id) {
        return patientRepository.findById(id);
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient patient = patientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Patient not found with id " + id));
        patient.setFullName(patientDetails.getFullName());
        patient.setGender(patientDetails.getGender());
        patient.setBirthDate(patientDetails.getBirthDate());
        patient.setPhoneNumber(patientDetails.getPhoneNumber());
        patient.setAddress(patientDetails.getAddress());
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        Patient patient = patientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Patient not found with id " + id));
        patientRepository.delete(patient);
    }
}

