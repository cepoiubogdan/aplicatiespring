package com.example.Intersection.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Intersection.model.Car;
import com.example.Intersection.repository.CarRepository;

@Service
public class CarService implements ICarService{

	@Autowired
	CarRepository carRepository;
	
	
	
	@Override
	public List<Car> findAll() {
		
		List<Car> allCars=carRepository.findAll();	
		return allCars;
		
	}

	@Override
	public Car findByID(Long id) {
		
		return carRepository.findById(id).orElseThrow();
		
	}

	@Override
	public Car addCar(Car car) {
		
		carRepository.save(car);
		return car;
	}

	@Override
	public Car getById(Long id) {
		
		
		return carRepository.findById(id).orElseThrow();
		
		
		
	}



}
