package com.example.examtest;

import com.example.examtest.repo.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class VetClinicApplicationTests {

    public static void main(String[] args) { SpringApplication.run(VetClinicApplication.class, args); }

    @Bean
    CommandLineRunner commandLineRunner(
            PetRepo petRepo,
            OwnerRepo ownerRepo,
            VetRepo vetRepo,
            RoomRepo roomRepo,
            AppointmentRepo appointmentRepo
    ) {

    }
    void contextLoads() {
    }

}
/*var room = new Room("examination room 1");
        var vet = new Vet("Bill Bobberson");
        var pet = new Pet("Fred", "Cat");
        var owner = new Owner("James Jonah Jamerson", "jjj@mail.com");
        var appt = new Appointment(LocalDateTime.now(), 1L);
        appt.setVet(vet);
        pet.setOwner(owner);
        appt.setPet(pet);
        appt.setRoom(room);
       */
