package com.dronemanagement.Done.Management.repository;

import com.dronemanagement.Done.Management.model.BatteryHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatteryHistoryRepository extends JpaRepository<BatteryHistory, Long> {
}
