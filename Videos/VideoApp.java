/**
 * @author KevHaes
 *
 */
package Videos;

import java.util.Date;
import java.util.Scanner;

public class VideoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// create a new user
		User newUser01 = new User();

		// add name to user
		boolean checkDone;
		do {
			checkDone = false;
			try {
				String name = InputMethods.scannAnswer("what is your name?");
				newUser01.setCheckedName(name);
				checkDone = true;
			} catch (Exception ex) {
				System.out.println("Couldn't add name:\n" + ex);
			}
		} while (!checkDone);

		// add pass to user
		do {
			checkDone = false;
			try {
				String pass = InputMethods.scannAnswer("what is your pass?");
				newUser01.setCheckedPass(pass);
				checkDone = true;
			} catch (Exception ex) {
				System.out.println("Couldn't add name:\n" + ex);
			}
		} while (!checkDone);

		// add time stamp to user
		newUser01.setTimeStamp(new Date());

		// inform user is created
		System.out.println("User succesfull created:\n " + newUser01.toString());

		String answer;

		// Menu to choose between: create video or See all videos

		do {
			answer = InputMethods
					.scannAnswer("To create a video type C.\n" + "To see all Videos type V\n" + "To exit type X")
					.toUpperCase();
			switch (answer) {
			case "C":
				Video.createVideoAndAddToCurrentUser(newUser01);
				break;
			case "V":
				System.out.println(User.seeAllVideos(newUser01));
				break;
			case "X":
				System.out.println("thank you, goodbye");
				break;
			default:
				System.out.println("This was not a correct answer");
				break;
			}
		} while (!(answer.equals("X")));

		sc.close();
	}
}