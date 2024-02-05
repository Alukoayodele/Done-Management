package com.dronemanagement.Done.Management.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record DroneManagementProperties(String welcomeMessage, String about) {
}
