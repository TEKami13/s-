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

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "owner_seq_gen")
    @SequenceGenerator(name = "owner_seq_gen", sequenceName = "owner_seq", allocationSize = 1)
    @Column(name = "owner_id")
    private Long ownerId = 0L;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "owner_email")
    private String ownerEmail;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("owner")
    @JoinColumn(name = "owner_id")
    @JsonManagedReference
    private List<Pet> pets = new ArrayList<>();

    public Owner(String ownerName, String ownerEmail) {
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
    }
}
