package com.app.checkkro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.checkkro.entity.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {

	@Query(value = "select car_company from car_details", nativeQuery = true)
	List<String> getAllCarCompanyName();
	
	@Query(value = "select car_name from car_details where car_company = ?1", nativeQuery = true)
	List<String> getAllCarByCarCompany(String car_company);
	
	@Query(value = "select * from car_details where car_name = ?1", nativeQuery = true)
	CarDetails getCarDetails(String car_name);
	
}