package com.dronemanagement.Done.Management.controller;

import com.dronemanagement.Done.Management.model.Drone;
import com.dronemanagement.Done.Management.model.Fleet;
import com.dronemanagement.Done.Management.service.DroneService;
import com.dronemanagement.Done.Management.service.FleetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drones")
@CrossOrigin
public class DroneController {

    @Autowired
    private DroneService droneService;

    @Autowired
    private FleetService fleetService;

    @GetMapping("")
    public  List<Drone> getAllDrones() {
        return droneService.getAllDrones();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Drone create(@Valid @RequestBody Drone drone){
        System.out.println(drone);
        return droneService.createDrone(drone);
    }
//
//    @GetMapping("/fleet")
//    public  List<Fleet> getAllFleet() {
//        return (List<Fleet>) fleetService.getAllFleet();
//    }
    @GetMapping("/available")
    public List<Drone> getAvailableDrones() {
        return droneService.getAvailableDrones();
    }

}
