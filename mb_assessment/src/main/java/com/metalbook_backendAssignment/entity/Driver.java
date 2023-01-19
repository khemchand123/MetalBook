package com.metalbook_backendAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="driver")
public class Driver {

    private String driverName;
    private String address;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String licenceNum;
    private long contact;
    private double rating;
    
    @OneToOne
    private Car car;

	public Driver(String driverName, String address, String licenceNum, long contact, double rating, Car car) {
		super();
		this.driverName = driverName;
		this.address = address;
		this.licenceNum = licenceNum;
		this.contact = contact;
		this.rating = rating;
		this.car = car;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLicenceNum() {
		return licenceNum;
	}

	public void setLicenceNum(String licenceNum) {
		this.licenceNum = licenceNum;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
    
	
    
}
