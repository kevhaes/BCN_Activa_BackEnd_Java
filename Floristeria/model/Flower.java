/**
 * @author KevHaes
 *
 */
package floristeria.model;

/**
 * @author KevHaes
 *
 */
public class Flower extends Product {

	/////////////// ATRIBUTES ///////////////

	private String color;

	/////////////// CONSTRUCTORS ///////////////

	public Flower(String name, Double price, String color) {
		super(name, price);
		this.color = color;

	}

	/////////////// TOSTRING ///////////////

	@Override
	public String toString() {
		return "\nFlower \ncolor = " + color + super.toString();
	}

}
