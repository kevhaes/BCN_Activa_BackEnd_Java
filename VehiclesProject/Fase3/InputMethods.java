/**
 * @author KevHaes
 *
 */
package com.vehicles.project;

import java.util.Scanner;

/**
 * @author KevHaes
 *
 */
public class InputMethods {

	/////////////// METHODS ///////////////
	public static String scannAnswer(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String input = sc.nextLine();
		return input;
	}

	// scanner method for Double input
	public static Double scannDoubleAnswer(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		Double input = sc.nextDouble();
		return input;
	}
	/////////////// ATRIBUTES ///////////////

	/////////////// CONSTRUCTORS ///////////////

	/////////////// GETTERS & SETTERS ///////////////

	/////////////// TOSTRING ///////////////

}
