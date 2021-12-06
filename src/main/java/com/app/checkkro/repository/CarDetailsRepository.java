package com.app.checkkro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.checkkro.entity.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {
	

}