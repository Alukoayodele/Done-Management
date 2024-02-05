package com.dronemanagement.Done.Management.service;

import com.dronemanagement.Done.Management.model.Drone;
import com.dronemanagement.Done.Management.model.Fleet;
import com.dronemanagement.Done.Management.model.State;
import com.dronemanagement.Done.Management.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DroneService {

    @Autowired
    private DroneRepository droneRepository;

    @Autowired
    private FleetService fleetService;

    public  List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }
    public List<Drone> getAvailableDrones() {
        return droneRepository.findByState(State.IDLE);
    }

    public Drone createDrone(Drone newDrone){
//        Long fleetId = newDrone.getFleet().getId();
//        Optional<Fleet> fleet = fleetService.getFleetById(fleetId);
//        if (fleet == null) {
//            return null;
//        }
        Drone drone = new Drone();
//        drone.setFleet(fleet.get());
        drone.setModel(newDrone.getModel());
        drone.setSerialNumber(newDrone.getSerialNumber());
        drone.setState(State.IDLE);
        drone.setBatteryCapacity(newDrone.getBatteryCapacity());
        drone.setWeightLimit(newDrone.getWeightLimit());

        return droneRepository.save(newDrone);
    }
}
