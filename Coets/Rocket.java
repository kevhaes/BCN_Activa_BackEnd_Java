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
public class Rocket {
	/////////////// ATRIBUTES ///////////////
	private String code;
	private ArrayList<Thruster> thrusters = new ArrayList<Thruster>();

	/////////////// CONSTRUCTORS ///////////////

	public Rocket(String code, ArrayList<Thruster> thrusters) {
		this.code = code;
		this.setThrusters(thrusters);
	}

	public Rocket(String code) {
		this.code = code;

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

	/////////////// TOSTRING ///////////////

	@Override
	public String toString() {
		return "Rocket [code=" + code + ", thrusters=" + thrusters + "]";
	}

}
