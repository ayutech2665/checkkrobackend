package com.app.checkkro.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.checkkro.entity.Battery;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Integer> {

	@Modifying
	@Query(value = "delete from car_battery_details where battery_company_name = ?1 and car_id = ?2", nativeQuery = true)
	void deleteCarbatteryDetails(String batteryCompanyName, int carid);


}