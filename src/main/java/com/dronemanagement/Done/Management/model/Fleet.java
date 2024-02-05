package com.dronemanagement.Done.Management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Data
@Table(name = "fleet")
public class Fleet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Getter
    @OneToMany(mappedBy = "fleet")
    private List<Drone> drones;

}
