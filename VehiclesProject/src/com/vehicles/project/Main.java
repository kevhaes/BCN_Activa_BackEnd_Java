package com.vehicles.project;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String plate = JOptionPane.showInputDialog("what is your car plate please?");
		String brand = JOptionPane.showInputDialog("what is your car brand please?");
		String color = JOptionPane.showInputDialog("what is your car color please?");

		Car car01 = new Car(plate, brand, color);

		String frontWheelsBrand = JOptionPane.showInputDialog("what is your wheel brand please?");
		double frontWheelsDiameter = Double
				.parseDouble(JOptionPane.showInputDialog("what is your wheel diameter please?"));
		String backWheelsBrand = JOptionPane.showInputDialog("what is your wheel brand please?");
		double backWheelsDiameter = Double
				.parseDouble(JOptionPane.showInputDialog("what is your wheel Diameter please?"));

		Wheel frontWheel = new Wheel(frontWheelsBrand, frontWheelsDiameter);
		Wheel backWheel = new Wheel(backWheelsBrand, backWheelsDiameter);

		ArrayList<Wheel> frontWheels = new ArrayList<>();
		frontWheels.add(frontWheel);
		frontWheels.add(frontWheel);

		ArrayList<Wheel> backWheels = new ArrayList<>();
		backWheels.add(backWheel);
		backWheels.add(backWheel);

		// car01.addWheels(frontWheels, backWheels); -> not working
		// frontWheel. no methods

		car01.wheels.addAll(frontWheels);
		car01.wheels.addAll(backWheels);

	}
}
