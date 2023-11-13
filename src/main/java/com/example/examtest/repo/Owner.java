package com.example.examtest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Owner extends JpaRepository<Owner, Long> {
}
