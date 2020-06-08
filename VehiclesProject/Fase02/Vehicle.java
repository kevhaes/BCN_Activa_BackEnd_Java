package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

///////////// VARIABLES ///////////

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

///////////// CONSTRUCTORS ///////////

	/// had to make this one to be able to create an empty constructor in Car
	public Vehicle() {
	};

}
