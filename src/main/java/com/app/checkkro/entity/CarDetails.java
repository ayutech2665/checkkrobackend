package com.app.checkkro.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "car_details")
public class CarDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int car_id;
	private String car_company;
	private String car_name;
	
	@OneToMany(targetEntity = Tyre.class , cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id" , referencedColumnName = "car_id")
	private List<Tyre> tyres;
	
	@OneToMany(targetEntity = Battery.class , cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id" , referencedColumnName = "car_id")
	private List<Battery> battery;

}
