/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

public class Wheel {

///////////// VARIABLES ///////////
	private String brand;
	private double diameter;

///////////// CONSTRUCTORS ///////////
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	/// empty constructor
	public Wheel() {
	};

///////////// GETTERS SETTERS ///////////
	public void setBrand(String brand) {
		this.brand = brand;
	}

///////////// METHODS ///////////
	public void SetCheckedDiameter(double diameter) throws Exception {
		if (diameter < 0.4 || diameter > 4) {
			throw new Exception("diameter is not between 0.4 and 4");
		} else {
			this.diameter = diameter;
		}
	}

	@Override
	public String toString() {
		return "Wheel [brand=" + brand + ", diameter=" + diameter + "]";
	}

}
