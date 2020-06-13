import java.util.ArrayList;

/**
 * @author KevHaes
 *
 */

/**
 * @author KevHaes
 *
 */
public class CoetsFase01App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create rocket1
		Rocket Rocket01 = new Rocket("XLDSFJA32");

		// create a Array of thrusters
		ArrayList<Thruster> rocket01ThrustersList = new ArrayList<>();

		// create and add new thrusters to rocket1
		rocket01ThrustersList.add(new Thruster("thruster1", 10));
		rocket01ThrustersList.add(new Thruster("thruster2", 30));
		rocket01ThrustersList.add(new Thruster("thruster3", 80));

		// print max powers of rocket 1 thrusters
		System.out.println(
				"Rocket " + Rocket01.getCode() + " has " + rocket01ThrustersList.size() + " thrusters with powers:");
		for (Thruster thruster : rocket01ThrustersList) {
			System.out.print(thruster.getMaxPower() + ",");
		}

		// create new rocket2
		Rocket Rocket02 = new Rocket("LDSFJA35");

		// create a Array of thrusters
		ArrayList<Thruster> rocket02ThrustersList = new ArrayList<>();

		// create and add new thrusters to rocket1
		rocket02ThrustersList.add(new Thruster("thruster1", 30));
		rocket02ThrustersList.add(new Thruster("thruster2", 40));
		rocket02ThrustersList.add(new Thruster("thruster3", 50));
		rocket02ThrustersList.add(new Thruster("thruster4", 50));
		rocket02ThrustersList.add(new Thruster("thruster5", 30));
		rocket02ThrustersList.add(new Thruster("thruster6", 10));

		// print max powers of rocket 2 thrusters
		System.out.println(
				"\nRocket " + Rocket02.getCode() + " has " + rocket02ThrustersList.size() + " thrusters with powers:");
		for (Thruster thruster : rocket02ThrustersList) {
			System.out.print(thruster.getMaxPower() + ",");

		}

	}

}
