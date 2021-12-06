package com.app.checkkro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "car_battery_details")
public class Battery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int battery_id;
	private String battery_company_name;
	private String battery_power;
	private int car_id;
	
	public Battery() {
		
	}
	
	public Battery(int battery_id, String battery_company_name, String battery_power) {
		super();
		this.battery_id = battery_id;
		this.battery_company_name = battery_company_name;
		this.battery_power = battery_power;
	}
	
	public Battery(int car_id, String battery_company_name) {
		super();
		this.car_id = car_id;
		this.battery_company_name = battery_company_name;
	}
		
}
