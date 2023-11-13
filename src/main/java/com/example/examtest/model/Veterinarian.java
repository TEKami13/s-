package com.example.examtest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
@Entity
@Table(name = "veterinarian")
public class Veterinarian {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vet_seq_gen")
    @SequenceGenerator(name = "vet_seq_gen", sequenceName = "vet_seq", allocationSize = 1)
    @Column(name = "vet_id")
    private Long vetId = 0L;

    @Column(name = "vet_name")
    private String vetName;


    public Veterinarian(String vetName) {
        this.vetName = vetName;
    }
}
