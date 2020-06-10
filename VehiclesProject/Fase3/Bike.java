/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

///////////// VARIABLES ///////////
	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

///////////// CONSTRUCTOR ///////////
	public Bike() {

	}

///////////// GETTERS SETTERS ///////////

///////////// METHODS ///////////

	public static void createBike() throws Exception {

		// create bike
		Bike bike01 = new Bike();

		// set brand
		String brand = InputMethods.scannAnswer("what is your bike brand please?");
		bike01.setBrand(brand);

		// set plate

		String plate = InputMethods.scannAnswer("what is your bike plate please?");
		bike01.setCheckedPlate(plate);

		// set color
		String color = InputMethods.scannAnswer("what is your bike color please?");
		bike01.setColor(color);

		/// inform user bike is created
		System.out.println("new bike created succesfull:" + bike01.toString());

		/// create 1 wheel
		String wheelbrand = InputMethods.scannAnswer("what is your front wheel brand?");
		double wheeldiameter = InputMethods.scannDoubleAnswer("what is your front wheel diameter?");
		Wheel frontWheel = new Wheel(wheelbrand, wheeldiameter);
		bike01.wheels.add(frontWheel);
		Wheel backWheel = new Wheel(wheelbrand, wheeldiameter);
		bike01.wheels.add(backWheel);

		/// inform user wheels added to bike
		System.out.println("Wheels where added to car" + bike01.getWheels());
		System.out.println("---END---");
	}

	/// inherited (to implement) plateSetter from abstract vehicle
	public void setCheckedPlate(String plate) {
		this.plate = plate;

	}
	/// inherited (to implement) wheelsSetter from abstract vehicle

	public void addTwoWheels(List<Wheel> wheels) {
//		Wheel frontWheel = wheels.get(0);
//		Wheel backWheel = wheels.get(1);
//
//		this.wheels.add(frontWheel);
//		this.wheels.add(backWheel);

	}

	@Override
	public String toString() {
		return "Bike [plate=" + plate + ", brand=" + brand + ", color=" + color + ", wheels=" + wheels + "]";
	}

}
