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
@Table(name = "car_tyre_details")
public class Tyre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tyre_id;
	private String tyre_company_name;
	private String tyre_model;
	private String tyre_model_size;
	private String tyre_warranty;
	
	
}
