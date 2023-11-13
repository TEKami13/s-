package com.example.examtest.service;

import com.example.examtest.model.Vet;
import com.example.examtest.repo.VetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetService {

    private final VetRepo vetRepo;

    @Autowired
    public VetService(VetRepo vetRepo) {
        this.vetRepo = vetRepo;
    }

    public List<Vet> getAllVets() {
        return vetRepo.findAll();
    }

    public Vet getVetById(Long id) {
        return vetRepo.findById(id).orElse(null);
    }

    public Vet createVet(Vet vet) {
        return vetRepo.save(vet);
    }
}
