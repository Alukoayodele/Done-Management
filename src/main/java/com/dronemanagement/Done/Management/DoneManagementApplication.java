package com.dronemanagement.Done.Management;

import com.dronemanagement.Done.Management.config.DroneManagementProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(DroneManagementProperties.class)

@SpringBootApplication
public class DoneManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoneManagementApplication.class, args);
	}

}
