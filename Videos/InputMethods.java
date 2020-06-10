/**
 * @author KevHaes
 *
 */
package Videos;

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

	public static boolean inputIsOk(String input) {
		boolean inputIsOk = false;
		if (input.length() > 0) {
			inputIsOk = true;
		}
		return inputIsOk;
	}

}
