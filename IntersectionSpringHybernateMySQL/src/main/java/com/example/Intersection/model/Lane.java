package com.example.Intersection.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="lanes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)

public class Lane {

	@Id
	private Long laneId;

	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	
	private List<Car> cars=new ArrayList<>();

	public Long getlaneId() {
		return this.laneId;
	}

	public void setlaneId(Long laneId) {
		this.laneId=laneId;
	}

	public List<Car> getcars() {
		return this.cars;
	}

	public void setcars(List<Car> cars) {
		this.cars=cars;
	}
	
	public void addCar(Car car) {
		this.cars.add(car);
		
	}

}
