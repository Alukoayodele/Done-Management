package com.dronemanagement.Done.Management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double weight;

    private String code;

    private String image; // Assuming you store image paths

    @ManyToOne
    @JoinColumn(name = "drone_id")
    private Drone drone;

}
