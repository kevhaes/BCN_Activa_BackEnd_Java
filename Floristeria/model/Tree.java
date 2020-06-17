/**
 * @author KevHaes
 *
 */
package floristeria.model;

/**
 * @author KevHaes
 *
 */
public class Tree extends Product {

	/////////////// ATRIBUTES ///////////////

	private int height;

	/////////////// CONSTRUCTORS ///////////////

	public Tree(String name, Double price, int height) {
		super(name, price);
		this.height = height;

	}

	/////////////// TOSTRING ///////////////

	@Override
	public String toString() {
		return "\nTree \nheight = " + height + super.toString();
	}

}
