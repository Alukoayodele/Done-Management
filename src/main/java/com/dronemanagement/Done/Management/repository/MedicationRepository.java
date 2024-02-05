package com.dronemanagement.Done.Management.repository;

import com.dronemanagement.Done.Management.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
