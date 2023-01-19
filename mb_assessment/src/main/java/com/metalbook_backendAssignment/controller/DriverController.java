package com.metalbook_backendAssignment.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metalbook_backendAssignment.dto.CarDTO;
import com.metalbook_backendAssignment.entity.Car;
import com.metalbook_backendAssignment.repository.DriverRepository;
import com.metalbook_backendAssignment.service.DriverService;

@RestController
@RequestMapping("/cars")
public class DriverController {
    
	@Autowired
 	private DriverService driverService;
	 
	@GetMapping("/licenceNum/{licenceNum}/license_plate/{license_plate}") //CarDTO
	public ResponseEntity<Car> enableCarByDriver(
			@PathParam("licenceNum") String licenceNum,
			@PathParam("license_plate") String license_plate){
		
	    Car selectCarByDriver = this.driverService.selectCarByDriver(licenceNum, license_plate);	
	    return new ResponseEntity<Car>(selectCarByDriver, HttpStatus.CREATED);
	}
	
	@GetMapping("/licenceNum/{licenceNum}") //CarDTO
	public ResponseEntity<Car> diableCarByDriver(
			@PathParam("licenceNum") String licenceNum
		){
		
	    Car selectCarByDriver = this.driverService.deselectCarByDriver(licenceNum);	
	    return new ResponseEntity<Car>(selectCarByDriver, HttpStatus.ACCEPTED);
	}

}
