package com.example.examtest.service;

import com.example.examtest.model.Owner;
import com.example.examtest.repo.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private final OwnerRepo ownerRepo;

    @Autowired
    public OwnerService(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    public List<Owner> getAllOwners() {
        return ownerRepo.findAll();
    }

    public Owner getOwnerById(Long id) {
        return ownerRepo.findById(id).orElse(null);
    }

    public Owner createOwner(Owner owner) {
        return ownerRepo.save(owner);
    }
}
