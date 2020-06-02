package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	// VEHICLE VARIABLES
	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) { // CONSTRUCTOR FOR GENERAL VEHICLE
		this.plate = plate;
		this.brand = brand;
		this.color = color;

	}
}