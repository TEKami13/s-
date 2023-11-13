package com.example.examtest.repo;

import com.example.examtest.model.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepo  extends JpaRepository<Veterinarian, Long>{
}
