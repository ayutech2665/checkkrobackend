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
@Table(name = "car_tyre_details")
public class Tyre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tyre_id;
	private String tyre_company_name;
	private String tyre_model;
	private String tyre_model_size;
	private String tyre_warranty;
	private int car_id;
	
	public Tyre() {
		
	}

	public Tyre(int tyre_id, String tyre_company_name, String tyre_model, String tyre_model_size,
			String tyre_warranty) {
		super();
		this.tyre_id = tyre_id;
		this.tyre_company_name = tyre_company_name;
		this.tyre_model = tyre_model;
		this.tyre_model_size = tyre_model_size;
		this.tyre_warranty = tyre_warranty;
	}

	public Tyre(int car_id ,int tyre_id, String tyre_company_name, String tyre_model, String tyre_model_size,
			String tyre_warranty) {
		super();
		this.car_id= car_id;
		this.tyre_id = tyre_id;
		this.tyre_company_name = tyre_company_name;
		this.tyre_model = tyre_model;
		this.tyre_model_size = tyre_model_size;
		this.tyre_warranty = tyre_warranty;
	}
	
	
}
