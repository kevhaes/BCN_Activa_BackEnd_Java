package com.vehicles.project;

public class Bike extends Vehicle { // HERENCIA FRON VEHICLE

	public Bike(String plate, String brand, String color) { // CONSTRUCTOR SPECIFIC FOR BIKE
		super(plate, brand, color); // CONSTRUCTOR FOR GENERAL PART VEHICLE
	}

}
