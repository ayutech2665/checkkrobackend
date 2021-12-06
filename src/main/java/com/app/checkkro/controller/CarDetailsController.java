package com.app.checkkro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.checkkro.entity.Battery;
import com.app.checkkro.entity.CarDetails;
import com.app.checkkro.entity.Tyre;
import com.app.checkkro.repository.BatteryRepository;
import com.app.checkkro.repository.CarDetailsRepository;
import com.app.checkkro.repository.TyreRepository;

@RestController
@RequestMapping("/v1/api")
public class CarDetailsController {

	@Autowired
	CarDetailsRepository carDetailsServiceRepository;
	
	@Autowired
	TyreRepository tyreRepository;
	
	@Autowired
	BatteryRepository batteryRepository;
	
	@GetMapping("/cardetails")
	public List<CarDetails> getCars() {
		return carDetailsServiceRepository.findAll();
	}

	
	@PostMapping("/cardetails")
	public ResponseEntity<CarDetails> addCar(@RequestBody CarDetails cardetails) {

		try {
			CarDetails t = carDetailsServiceRepository.save(cardetails);
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/cardetails/updatetyres")
	public  List<Tyre> updatecartyredetails(@RequestBody List<Tyre> tyres) {

		try {
			List<Tyre> t = tyreRepository.saveAll(tyres);
			return t;
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			return null;
			
		}
	}
	
	@PostMapping("/cardetails/updatetyre")
	public Tyre updatecartyredetail(@RequestBody Tyre tyres) {

		try {
			Tyre t = tyreRepository.save(tyres);
			return t;
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			return null;
			
		}
	}
	
	
	
	@GetMapping("/cardetails/deletetyres/{tyresize}/{cartyrename}/{carid}")
	public void deleteCartyreDetails(@PathVariable String tyresize, @PathVariable String cartyrename,
			@PathVariable int carid) {

		try {

			tyreRepository.deleteCartyreDetails(tyresize, cartyrename, carid);

		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());

		}

	}
	
	@PostMapping("/cardetails/updatebatteries")
	public  List<Battery> updatecarbatterydetails(@RequestBody List<Battery> batteries) {

		try {
			List<Battery> t = batteryRepository.saveAll(batteries);
			return t;
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			return null;
			
		}
	}
	
	@PostMapping("/cardetails/updatebattery")
	public  Battery updatecarbatterydetail(@RequestBody Battery battery) {

		try {
			Battery t = batteryRepository.save(battery);
			return t;
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			return null;
			
		}
	}

	@GetMapping("/cardetails/deletebattery/{batterycompany}/{carid}")
	public void deleteCarbatteryDetails(@PathVariable String batterycompany,
			@PathVariable int carid) {

		try {

			batteryRepository.deleteCarbatteryDetails(batterycompany, carid);

		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());

		}

	}
	
	
	

}
