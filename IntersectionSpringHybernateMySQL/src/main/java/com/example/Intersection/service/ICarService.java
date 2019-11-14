package com.example.Intersection.service;

import java.util.List;

import com.example.Intersection.model.Car;

public interface ICarService {
	
		List<Car> findAll();
	    Car findByID(Long id);
	    Car addCar(Car car);
	    Car getById(Long id);
	    

}
