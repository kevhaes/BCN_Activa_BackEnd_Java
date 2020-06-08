/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KevHaes
 *
 */
public class VehiclesProjectApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/// instance car object
		Car car01 = new Car();

		/// collect and set car object values
		String brand = scannAnswer("what is your car brand please?");
		car01.setBrand(brand);

		/// check and set plate
		boolean setPlate = false;
		while (!setPlate) {
			String plate = scannAnswer("what is your car plate please?");
			try {
				car01.setCheckedPlate(plate);
				setPlate = true;
			} catch (Exception ex) {
				System.out.println("Could not set the plate:");
				System.out.println(ex);
			}
		}

		String color = scannAnswer("what is your car color please?");
		car01.setColor(color);

		/// inform user car is created
		System.out.println("new car created succesfull:" + car01.toString());

		/// create front wheel and set variables
		Wheel frontwheel = new Wheel();
		String frontwheelBrand = scannAnswer("what is your front wheel brand please?");
		frontwheel.setBrand(frontwheelBrand);
		boolean setDiameter = false;
		while (!setDiameter) {
			double diameter = scannDoubelAnswer("what is your front wheel diameter please?");
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
		String backwheelBrand = scannAnswer("what is your  back wheel brand please?");

		setDiameter = false;
		while (!setDiameter) {
			backwheel.setBrand(backwheelBrand);
			double backwheeldiameter = scannDoubelAnswer("what is your wheel backwheel diameter please?");
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

///////////// METHODS ///////////

	// Scanner method for input
	public static String scannAnswer(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String input = sc.nextLine();
		return input;
	}

	// scanner method for Double input
	public static Double scannDoubelAnswer(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		Double input = sc.nextDouble();
		return input;
	}
}
