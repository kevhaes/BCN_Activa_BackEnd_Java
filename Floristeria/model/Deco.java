/**
 * @author KevHaes
 *
 */
package floristeria.model;

/**
 * @author KevHaes
 *
 */
public class Deco extends Product {

	/////////////// ATRIBUTES ///////////////

	String material;

	/////////////// CONSTRUCTORS ///////////////

	public Deco(String name, Double price, String material) {
		super(name, price);
		this.material = material;
	}

	/////////////// TOSTRING ///////////////

	@Override
	public String toString() {
		return "\nDeco \nmaterial=" + material + super.toString();
	}

}
