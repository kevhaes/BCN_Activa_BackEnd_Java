/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

import java.util.ArrayList;
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

///////////// METHODS ///////////

	// collect params and create car
	public static void createCar() {

		Car car01 = new Car();

		/// collect and set car object values
		String brand = InputMethods.scannAnswer("what is your car brand please?");
		car01.setBrand(brand);

		/// check and set plate
		boolean setPlate = false;
		while (!setPlate) {
			String plate = InputMethods.scannAnswer("what is your car plate please?");
			try {
				car01.setCheckedPlate(plate);
				setPlate = true;
			} catch (Exception ex) {
				System.out.println("Could not set the plate:");
				System.out.println(ex);
			}
		}

		String color = InputMethods.scannAnswer("what is your car color please?");
		car01.setColor(color);

		/// inform user car is created
		System.out.println("new car created succesfull:" + car01.toString());

		/// create front wheel and set variables
		Wheel frontwheel = new Wheel();
		String frontwheelBrand = InputMethods.scannAnswer("what is your front wheel brand please?");
		frontwheel.setBrand(frontwheelBrand);
		boolean setDiameter = false;
		while (!setDiameter) {
			double diameter = InputMethods.scannDoubleAnswer("what is your front wheel diameter please?");
			try {
				frontwheel.SetCheckedDiameter(diameter);
				setDiameter = true;
			} catch (Exception ex) {
				System.out.println("could not set diameter:");
				System.out.println(ex);
			}
		}
		/// inform user front wheel is created
		System.out.println("new front wheel created succesfull:" + frontwheel.toString());

		/// create back wheel and set variables
		Wheel backwheel = new Wheel();
		String backwheelBrand = InputMethods.scannAnswer("what is your  back wheel brand please?");

		setDiameter = false;
		while (!setDiameter) {
			backwheel.setBrand(backwheelBrand);
			double backwheeldiameter = InputMethods.scannDoubleAnswer("what is your wheel backwheel diameter please?");
			try {
				backwheel.SetCheckedDiameter(backwheeldiameter);
				setDiameter = true;
			} catch (Exception ex) {
				System.out.println("could not set diameter:");
				System.out.println(ex);
			}

		}

		/// inform user front wheel is created
		System.out.println("new back wheel created succesfull:" + backwheel.toString());

		/// add wheels to car

		/// create new front wheels Array
		ArrayList<Wheel> twoFrontwheels = new ArrayList<Wheel>();
		twoFrontwheels.add(frontwheel);
		twoFrontwheels.add(frontwheel);

		/// create new front wheels Array
		ArrayList<Wheel> twoBackwheels = new ArrayList<Wheel>();
		twoBackwheels.add(backwheel);
		twoBackwheels.add(backwheel);

		/// add frontWheels to Car Wheels Array
		try {
			car01.addWheels(twoFrontwheels, twoBackwheels);
			/// inform user wheels are added to car:
			System.out.println("Wheels where added to car" + car01.getWheels());
			System.out.println("---END---");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	// add some frontWheels Array to instance using add2wheels method
	// add some backWheels Array to instance using add2wheels method

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	// grab 2 wheels from some wheels Array
	// assign them as R an L wheel
	// check if R = L
	// add to instance wheel Array
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

	/// check and add plate method
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

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand + ", color=" + color + ", wheels=" + wheels + "]";
	}

}
