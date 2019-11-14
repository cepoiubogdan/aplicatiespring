package com.example.Intersection.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Intersection.model.Car;
import com.example.Intersection.repository.CarRepository;
import com.example.Intersection.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
	CarService carService;

	@GetMapping("/cars")
	public List<Car> get() {
		
		return carService.findAll();
	}
	
	@PostMapping("/cars")
	public Car postCar(@Valid @RequestBody Car car) {
		return carService.addCar(car);
	}
	
	
	@GetMapping("/cars/{id}")
	public Car getCarById(@PathVariable(value = "id") Long carId) {
	    return carService.getById(carId);
	}
	
	
	
}
