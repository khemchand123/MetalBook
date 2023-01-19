package com.metalbook_backendAssignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalbook_backendAssignment.ExceptionHandler.MBookCarNotFoundException;
import com.metalbook_backendAssignment.entity.Car;
import com.metalbook_backendAssignment.entity.Driver;
import com.metalbook_backendAssignment.repository.CarRepository;
import com.metalbook_backendAssignment.repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository driverRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	public Car selectCarByDriver(String licenceNum, String license_plate) {
		
	   	Car car = this.carRepository.findById(license_plate).orElseThrow(
	   			()-> new MBookCarNotFoundException(license_plate));
	   	car.setAvailable(false);
	   	
	   	this.carRepository.save(car);
	   	
		Driver driver = this.driverRepository.findById(licenceNum).orElseThrow(
	   			()-> new MBookCarNotFoundException(licenceNum));  // Todo new expection instead
		
		driver.setCar(car);
	   	this.driverRepository.save(driver);
	   	return car;
	}
	
	public Car deselectCarByDriver(String licenceNum) {
		
		Driver driver = this.driverRepository.findById(licenceNum).orElseThrow(
	   			()-> new MBookCarNotFoundException(licenceNum));  // Todo new expection instead
		 
		 Car car = driver.getCar();
		 if(car == null) {
			 throw new MBookCarNotFoundException("----");
		 }
		 car.setAvailable(true);
		 this.carRepository.save(car);
		 
		 driver.setCar(null);
		 this.driverRepository.save(driver);
		 return car;
	}
}


/**
 * Driver -> selectcar = [
 * 
 * */
