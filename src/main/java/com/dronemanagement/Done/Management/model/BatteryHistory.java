package com.dronemanagement.Done.Management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "battery_history")
public class BatteryHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "drone_id")
    private Drone drone;

    private double batteryLevel;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

}
