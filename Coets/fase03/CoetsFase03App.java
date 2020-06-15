import java.util.ArrayList;

/**
 * @author KevHaes
 *
 */

/**
 * @author KevHaes
 *
 */
public class CoetsFase03App {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " started");

		System.out.println("start main Thread\n");

		// create rocket1
		Rocket rocket01 = new Rocket("XLDSFJA32");

		// create a Array of thrusters
		ArrayList<Thruster> thrusters_of_rocket01 = new ArrayList<>();

		// create and add new thrusters to rocket1
		thrusters_of_rocket01.add(new Thruster("thruster1", 10));
		thrusters_of_rocket01.add(new Thruster("thruster2", 30));
		thrusters_of_rocket01.add(new Thruster("thruster3", 80));
		rocket01.setThrusters(thrusters_of_rocket01);

		// print rocket01
		System.out.println(rocket01.toString());

//------------------
		// create new rocket2
		Rocket rocket02 = new Rocket("LDSFJA35");

		// create a Array of thrusters
		ArrayList<Thruster> thrusters_of_rocket02 = new ArrayList<>();

		// create and add new thrusters to rocket1
		thrusters_of_rocket02.add(new Thruster("thruster1", 30));
		thrusters_of_rocket02.add(new Thruster("thruster2", 40));
		thrusters_of_rocket02.add(new Thruster("thruster3", 50));
		thrusters_of_rocket02.add(new Thruster("thruster4", 50));
		thrusters_of_rocket02.add(new Thruster("thruster5", 30));
		thrusters_of_rocket02.add(new Thruster("thruster6", 10));
		rocket02.setThrusters(thrusters_of_rocket02);

		// print rocket02
		System.out.println(rocket02.toString());

//------------------
		// launch the rockets (accelerating)
		rocket01.takeOff();
		Thread.sleep(2_000);
		rocket02.takeOff();
		// main threat waits 15sec and aborts mission (breaking)
		Thread.sleep(15_000);
		rocket01.abortMission();
		Thread.sleep(20_000);
		rocket02.abortMission();

		System.out.println(Thread.currentThread().getName() + " ended");

	}

}
