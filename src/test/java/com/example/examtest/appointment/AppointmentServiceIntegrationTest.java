package com.example.examtest.appointment;

import com.example.examtest.service.AppointmentService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppointmentServiceIntegrationTest {

    @Autowired
    AppointmentService appointmentService;

    @Test
    @Transactional
    void shouldFetchAppointments() {

        var appointments = appointmentService.getAllAppointments();

        //assert appointments .size() == 1;
        //assert appointments.get(0).getVet().getVetName().equals("Ted");
    }

}
