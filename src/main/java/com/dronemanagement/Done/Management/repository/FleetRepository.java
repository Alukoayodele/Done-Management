package com.dronemanagement.Done.Management.repository;

import com.dronemanagement.Done.Management.model.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FleetRepository extends JpaRepository<Fleet, Long> {
}
