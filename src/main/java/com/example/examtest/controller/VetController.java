package com.example.examtest.controller;

import com.example.examtest.model.Appointment;
import com.example.examtest.model.Vet;
import com.example.examtest.service.AppointmentService;
import com.example.examtest.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vet")
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping
    public List<Vet> getAllVet() {
        return vetService.getAllVets();
    }

    @GetMapping("/{id}")
    public Vet getVetById(@PathVariable Long id) {
        return vetService.getVetById(id);
    }

    @PostMapping
    public Vet createVet(@RequestBody Vet vet) {
        return vetService.createVet(vet);
    }
}
