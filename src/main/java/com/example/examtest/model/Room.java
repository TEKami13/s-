package com.example.examtest.model;

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
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_seq_gen")
    @SequenceGenerator(name = "room_seq_gen", sequenceName = "room_seq", allocationSize = 1)
    @Column(name = "room_id")
    private Long roomId = 0L;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private List<Appointment> appointments = new ArrayList<>();
}
