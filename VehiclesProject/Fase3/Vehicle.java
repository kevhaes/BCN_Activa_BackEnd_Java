/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle extends Wheel {

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
///////////// GETTERS SETTERS ///////////

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Wheel> getWheels() {
		return wheels;

	}

///////////// METHODES ///////////
	public abstract void setCheckedPlate(String plate) throws Exception;

	public abstract void addTwoWheels(List<Wheel> wheels) throws Exception;
}
