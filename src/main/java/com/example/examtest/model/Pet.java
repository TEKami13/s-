package com.example.examtest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_seq_gen")
    @SequenceGenerator(name = "pet_seq_gen", sequenceName = "pet_seq", allocationSize = 1)
    @Column(name = "pet_id")
    private Long petId = 0L;

    @Column(name = "pet_name")
    private String petName;

    @Column(name = "pet_type")
    private String petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @JsonIgnoreProperties("pet")
    private Owner owner;

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;
    }
}
