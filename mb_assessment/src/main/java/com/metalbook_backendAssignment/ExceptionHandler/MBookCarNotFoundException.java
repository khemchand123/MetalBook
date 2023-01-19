package com.metalbook_backendAssignment.ExceptionHandler;


public class MBookCarNotFoundException extends RuntimeException {
	
      private String license_plate;
      
	  public MBookCarNotFoundException(String license_plate) {
    	  super(String.format("Car not found of license_plate %s",license_plate));
    	  this.license_plate = license_plate;
      }
	  
}
