package com.example.Intersection.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Intersection.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>{

}
