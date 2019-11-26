package com.example.Intersection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Intersection.model.Lane;
import com.example.Intersection.model.Car;

import com.example.Intersection.service.LaneService;

@RestController
@RequestMapping("/api")
public class LaneController {

	@Autowired
	LaneService service;
	
	@GetMapping("/lanes")
	public List<Lane> getLanes(){
		return service.findAll();
	}
	
	@PostMapping("/lanes")
	public void postCar(@RequestBody Lane lane) {
		service.addCar(lane);
	}
	
}
