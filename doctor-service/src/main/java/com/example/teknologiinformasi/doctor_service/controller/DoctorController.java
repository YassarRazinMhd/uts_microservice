package com.example.teknologiinformasi.doctor_service.controller;

import com.example.teknologiinformasi.doctor_service.model.Doctor;
import com.example.teknologiinformasi.doctor_service.service.DoctorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    private static final Logger log = LoggerFactory.getLogger(DoctorController.class);

    @Autowired
    private DoctorService doctorService;

    // Endpoint untuk mengambil semua dokter
    @GetMapping
    public List<Doctor> getAllDoctors() {
        log.info("GET /api/doctor accessed");
        return doctorService.getAllDoctors();
    }

    // Endpoint untuk mengambil dokter berdasarkan id
    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
        log.info("GET /api/doctor/{} accessed", id);
        return doctorService.getDoctorById(id)
                .map(doctor -> ResponseEntity.ok().body(doctor))
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint untuk membuat dokter baru
    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        log.info("POST /api/doctor accessed with body: {}", doctor);
        return doctorService.createDoctor(doctor);
    }

    // Endpoint untuk mengupdate dokter yang sudah ada
    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Long id, @RequestBody Doctor doctorDetails) {
        log.info("PUT /api/doctor/{} accessed with body: {}", id, doctorDetails);
        try {
            Doctor updatedDoctor = doctorService.updateDoctor(id, doctorDetails);
            return ResponseEntity.ok(updatedDoctor);
        } catch (RuntimeException e) {
            log.warn("PUT /api/doctor/{} failed: {}", id, e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint untuk menghapus dokter
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteDoctor(@PathVariable Long id) {
        log.info("DELETE /api/doctor/{} accessed", id);
        Map<String, String> response = new HashMap<>();
        try {
            doctorService.deleteDoctor(id);
            response.put("message", "Doctor berhasil dihapus");
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("message", "Doctor tidak ditemukan dengan id " + id);
            log.warn("DELETE /api/doctor/{} failed: {}", id, e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }
}
