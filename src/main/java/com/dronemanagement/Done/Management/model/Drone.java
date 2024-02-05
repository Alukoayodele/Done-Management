package com.dronemanagement.Done.Management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Table(name = "drone")
public class Drone {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    private String serialNumber;
    @Setter
    private Model model;
    private double weightLimit;
    private double batteryCapacity;
    private State state;
    @ManyToOne
    @JoinColumn(name="fleet_id")
    private Fleet fleet;

    @OneToMany(mappedBy = "drone")
    private List<BatteryHistory> batteryHistories;

    @OneToMany(mappedBy = "drone")
    private List<Medication> medications;

}
