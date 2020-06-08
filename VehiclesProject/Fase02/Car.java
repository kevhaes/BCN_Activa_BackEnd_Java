package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

///////////// VARIABLES ///////////

///////////// CONSTRUCTORS ///////////
	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	/// empty constructor
	public Car() {
	};

///////////// GETTERS SETTERS ///////////
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// setter 4 wheels using setter 2 wheels
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	// setter method to add 2 wheels to car

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("ther are mor or les than 2 wheels");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("right wheel and left wheel don't have the same diameter");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	/// setter or method for checked plate
	public void setCheckedPlate(String plate) throws Exception {

		int digitsCount = 0;
		int lettersCount = 0;
		for (int j = 0; j < plate.length(); j++) {

			char c = plate.charAt(j);

			if (Character.isDigit(c)) {
				digitsCount++;
			} else if (Character.isLetter(c)) {
				lettersCount++;
			}
		}

		if (!(digitsCount == 4 && lettersCount == 2 || lettersCount == 3)) {
			throw new Exception("not correct plate format. Need to be 4 numbers and 2 or 3 letters");
		} else {
			this.plate = plate;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Wheel> getWheels() {
		return wheels;

	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand + ", color=" + color + ", wheels=" + wheels + "]";
	}

}
