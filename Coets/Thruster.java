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
	private String name;
	private int maxPower;

	/////////////// CONSTRUCTORS ///////////////
	Thruster(String name, int maxPower) {
		this.name = name;
		this.maxPower = maxPower;

	}
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
	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
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

	/////////////// METHODS ///////////////

	/////////////// TOSTRING ///////////////
	@Override
	public String toString() {
		return "Thruster [name=" + name + ", maxPower=" + maxPower + "]";
	}

}
