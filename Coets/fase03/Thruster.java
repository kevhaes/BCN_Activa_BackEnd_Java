/**
 * @author KevHaes
 *
 */

/**
 * @author KevHaes
 *
 */
public class Thruster {
	/////////////// ATRIBUTES ///////////////
	// constructor
	private String name;
	protected int maxPower;
	protected int currentPower;

	/////////////// CONSTRUCTORS ///////////////

	// constructor with default 0 power
	Thruster(String name, int maxPower) {
		this.name = name;
		this.maxPower = maxPower;
		this.currentPower = 0;

	}

	/*
	 * Thruster(String name, int power) { this.name = name; this.maxPower = power }
	 */
	/////////////// GETTERS & SETTERS ///////////////

	/**
	 * @return the power
	 */
	public int getMaxPower() {
		return maxPower;
	}

	/**
	 * @param power the power to set
	 */
	public void setMaxPower(int power) {
		this.maxPower = power;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the currentPower
	 */
	public int getCurrentPower() {
		return currentPower;
	}

	/**
	 * @param currentPower the currentPower to set
	 */
	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}
	/////////////// METHODS ///////////////

	/////////////// TOSTRING ///////////////
	@Override
	public String toString() {
		return "Thruster [name=" + name + ", maxPower=" + maxPower + ", currentPower=" + currentPower + "]";
	}

}
