package com.example.teknologiinformasi.appointment_service.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.example.teknologiinformasi.appointment_service.config.AppointmentRabbitConfig;
import com.example.teknologiinformasi.appointment_service.event.AppointmentCreatedEvent;

@Service
public class AppointmentMessageProducer {

    private final RabbitTemplate rabbitTemplate;

    public AppointmentMessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendAppointmentCreatedEvent(AppointmentCreatedEvent event) {
        // Mengirim event ke exchange dengan routing key yang sudah didefinisikan
        rabbitTemplate.convertAndSend(AppointmentRabbitConfig.APPOINTMENT_EXCHANGE, AppointmentRabbitConfig.APPOINTMENT_ROUTING_KEY, event);
        System.out.println("AppointmentService mengirim event: " + event);
    }
}

