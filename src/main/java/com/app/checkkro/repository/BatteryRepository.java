package com.app.checkkro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.checkkro.entity.Battery;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Integer> {


}