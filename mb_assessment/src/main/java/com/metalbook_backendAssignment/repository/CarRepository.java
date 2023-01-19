package com.metalbook_backendAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalbook_backendAssignment.entity.Car;

public interface CarRepository extends JpaRepository<Car, String> {

}
