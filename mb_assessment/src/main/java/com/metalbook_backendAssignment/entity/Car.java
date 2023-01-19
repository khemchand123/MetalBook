package com.metalbook_backendAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String license_plate;
	private int seat_count;
	private String convertible;
	private double rating;
	private String engine_type;
	private String manufacturer;
	private boolean available;
	
	public Car(String license_plate, int seat_count, String convertible, double rating, String engine_type,
			String manufacturer, boolean available) {
		super();
		this.license_plate = license_plate;
		this.seat_count = seat_count;
		this.convertible = convertible;
		this.rating = rating;
		this.engine_type = engine_type;
		this.manufacturer = manufacturer;
		this.available = available;
	}

	public String getLicense_plate() {
		return license_plate;
	}

	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public int getSeat_count() {
		return seat_count;
	}

	public void setSeat_count(int seat_count) {
		this.seat_count = seat_count;
	}

	public String getConvertible() {
		return convertible;
	}

	public void setConvertible(String convertible) {
		this.convertible = convertible;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getEngine_type() {
		return engine_type;
	}

	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	
	
}
