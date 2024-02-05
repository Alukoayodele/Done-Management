package com.dronemanagement.Done.Management.repository;

import com.dronemanagement.Done.Management.model.Drone;
import com.dronemanagement.Done.Management.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DroneRepository extends JpaRepository<Drone, Long> {
    List<Drone> findByState(State state);
}
