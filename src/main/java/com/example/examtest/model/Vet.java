package com.example.examtest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor
@Entity
@Table(name = "vet")
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vet_seq_gen")
    @SequenceGenerator(name = "vet_seq_gen", sequenceName = "vet_seq", allocationSize = 1)
    @Column(name = "vet_id")
    private Long vetId = 0L;

    @Column(name = "vet_name")
    private String vetName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vet_id")
    @JsonIgnoreProperties("vet")
    @JsonManagedReference
    private List<Appointment> appointments = new ArrayList<>();

    public Vet(String vetName) {
        this.vetName = vetName;
    }
}
