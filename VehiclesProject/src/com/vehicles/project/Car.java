package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle { // HERENCIA FROM VEHICLE

	public Car(String plate, String brand, String color) { // CONSTRUCTOR SPECIFICE TO CAR
		super(plate, brand, color); // CONSTRUCTOR HERENCIA PART VEHICLE
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception { // SETTER WHEELS
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception { // SETTER WHEEL SIZE
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}
