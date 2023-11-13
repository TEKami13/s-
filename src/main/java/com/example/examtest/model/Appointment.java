package com.example.examtest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_seq_gen")
    @SequenceGenerator(name = "appointment_seq_gen", sequenceName = "appointment_seq", allocationSize = 1)
    @Column(name = "appointment_id")
    private Long appointmentId = 0L;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    //@JsonIgnoreProperties("appointment")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id")
    //@JsonIgnoreProperties("veterinarian")
    private Veterinarian vet;

    @ManyToOne
    @JoinColumn(name = "room_id")
    //@JsonIgnoreProperties("room")
    private Room room;

    public Appointment(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
