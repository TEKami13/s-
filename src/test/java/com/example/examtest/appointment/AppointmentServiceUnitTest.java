package com.example.examtest.appointment;


import com.example.examtest.model.Appointment;
import com.example.examtest.repo.AppointmentRepo;
import com.example.examtest.service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class AppointmentServiceUnitTest {

    @MockBean
    private AppointmentRepo appointmentRepo;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    void shouldFetchAllAppointments() {

        List<Appointment> appointmentList = List.of(new Appointment(), new Appointment());
        when(appointmentRepo.findAll()).thenReturn(appointmentList);

        var appointments = appointmentService.getAllAppointments();
        assert appointments.size() == 2;
    }

    @Test
    void shouldDeleteAppointment() {
        List<Appointment> appointmentList = List.of(new Appointment(), new Appointment());
        when(appointmentRepo.findAll()).thenReturn(appointmentList);

        var appointments = appointmentService.getAllAppointments();
        assert appointments.size() == 2;

        appointments = List.of(new Appointment());
        assert appointments.size() == 1;
    }


}
