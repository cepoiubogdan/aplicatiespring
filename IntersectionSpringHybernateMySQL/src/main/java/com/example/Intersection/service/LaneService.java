package com.example.Intersection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Intersection.model.Car;
import com.example.Intersection.model.Lane;
import com.example.Intersection.repository.LaneRepository;
import com.example.Intersection.service.ILaneService;

@Service
public class LaneService implements ILaneService{
	
	@Autowired
	LaneRepository laneRepository;

	@Override
	public List<Lane> findAll() {
		// TODO Auto-generated method stub
		return laneRepository.findAll();
	}

	@Override
	public Lane addCar( Lane lane) {
		// TODO Auto-generated method stub
		return laneRepository.save(lane);
	}

}
