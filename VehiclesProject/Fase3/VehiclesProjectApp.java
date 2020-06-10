/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

/**
 * @author KevHaes
 *
 */
public class VehiclesProjectApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String choiceToCreate;

		/// make choice between creating car or bike
		do {
			choiceToCreate = InputMethods.scannAnswer("what do you want to create for Car type: C for bike type B")
					.toUpperCase();

			switch (choiceToCreate) {
			case "C":
				Car.createCar();
				break;
			case "B":
				try {
					Bike.createBike();
				} catch (Exception e) {
					System.out.println("somthing whent wrong during creating B ike");
				}
				break;
			default:
				System.out.println("you did not enter C or B");
				break;
			}
		} while (!(choiceToCreate.equals("B") || choiceToCreate.equals("C")));
		// TODO how to use regEx here

	}
}
