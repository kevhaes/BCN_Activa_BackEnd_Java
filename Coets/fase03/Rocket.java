import java.util.ArrayList;
import java.util.List;

/**
 * @author KevHaes
 *
 */

/**
 * @author KevHaes
 *
 */
public class Rocket implements Runnable {

	/////////////// ATRIBUTES ///////////////
	private String code;
	private ArrayList<Thruster> thrusters;

	/////////////// CONSTRUCTORS ///////////////

	public Rocket(String code, ArrayList<Thruster> thrusters) {
		this.code = code;
		this.thrusters = new ArrayList<Thruster>();
	}

	public Rocket(String code) {
		this.code = code;

	}

	public Rocket() {

	}

	/////////////// GETTERS & SETTERS ///////////////

	/**
	 * @param code2
	 * @param asList
	 */
	public Rocket(String code2, List<Thruster> thrusters) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the thrusters
	 */
	public ArrayList<Thruster> getThrusters() {
		return thrusters;
	}

	/**
	 * @param thrusters the thrusters to set
	 */
	public void setThrusters(ArrayList<Thruster> thrusters) {
		this.thrusters = thrusters;
	}

	/////////////// METHODS ///////////////

	// runnable run method
	public void run() {
		// System.out.println("*** " + Thread.currentThread().getName() + " started
		// ****");

		System.out.println("Rocket " + this.code + " ready for takeoff");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Go!" + this);
		try {
			this.accelerating();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// System.out.println("*** " + Thread.currentThread().getName() + " ended
		// ****");

	}

	// accelerate method
	public void accelerating() throws InterruptedException {
		for (Thruster t : thrusters) {
			while (t.currentPower < t.maxPower) {
				t.currentPower++;
				System.out.println(t.getName() + " current powers: " + t.currentPower);
				Thread.sleep(1000);
			}
			System.out.println(t.getName() + " has his max power reached!");
		}
		System.out.println(thrusters.toString());
	}

	// breaking command
	public void abortMission() throws InterruptedException {
		System.out.println("Houston we have a problem\nabord mission!");
		breaking();

	}

	// Launch a rocket -> count down an start the thread
	public void takeOff() throws InterruptedException {

		Thread takeoffThread = new Thread(this, "MyThread");
		takeoffThread.start();

	}

	// slow Down method
	public void breaking() throws InterruptedException {
		// takeoffThread.interupt(); -> no working
		for (Thruster t : thrusters) {
			while (t.currentPower > 0) {
				t.currentPower--;
				System.out.println(t.getName() + " current powers: " + t.currentPower);
				Thread.sleep(1000);
			}
			System.out.println(t.getName() + " turned off");
		}
		System.out.println(thrusters.toString());
	}

	/////////////// TOSTRING ///////////////
	@Override
	public String toString() {
		return "Rocket [code=" + code + ", thrusters=" + thrusters + "]";
	}

}
