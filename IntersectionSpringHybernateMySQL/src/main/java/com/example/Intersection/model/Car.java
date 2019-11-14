package com.example.Intersection.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="cars")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class Car implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long carId;

	@NotNull
	private String vehicleId;

	@NotNull
	private Long laneId;

	public Long getcarId() {

		return this.carId;

	}

	public void setcarId(Long carId) {

		this.carId=carId;

	}

	public String getvehicleId() {

		return this.vehicleId;

	}

	public void setVehicleId(String vehicleId) {

		this.vehicleId=vehicleId;

	}

	public Long getLaneId() {

		return this.laneId;

	}

	public void setLaneId(Long laneId) {

		this.laneId=laneId;

	}	

}
