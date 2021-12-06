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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "car_battery_details")
public class Battery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int battery_id;
	private String battery_company_name;
	private String battery_power;

}
