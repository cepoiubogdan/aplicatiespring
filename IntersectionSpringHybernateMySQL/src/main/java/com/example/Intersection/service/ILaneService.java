package com.example.Intersection.service;

import java.util.List;

import com.example.Intersection.model.Car;
import com.example.Intersection.model.Lane;

public interface ILaneService {

	List<Lane> findAll();
	Lane addCar(Lane lane);

}
