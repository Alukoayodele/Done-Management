package com.dronemanagement.Done.Management.service;

import com.dronemanagement.Done.Management.model.Drone;
import com.dronemanagement.Done.Management.model.Fleet;
import com.dronemanagement.Done.Management.repository.FleetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FleetService {
    @Autowired
    private FleetRepository fleetRepository;

    public Optional<Fleet> getFleetById(Long fleetId) {
        return fleetRepository.findById(fleetId);
    }

    public Fleet getAllFleet() {
        return (Fleet) fleetRepository.findAll();
    }

}
