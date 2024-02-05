package com.dronemanagement.Done.Management.controller;

import com.dronemanagement.Done.Management.config.DroneManagementProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private final DroneManagementProperties properties;

    public RootController(DroneManagementProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public DroneManagementProperties root() {
        return properties;
    }
}
