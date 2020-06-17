/**
 * @author KevHaes
 *
 */
package floristeria.model;

/**
 * @author KevHaes
 *
 */
//parent class of flower/tree/deco
//abstract to avoids instantiating instances 
public abstract class Product {

	/////////////// ATRIBUTES ///////////////

	private String name;
	private Double price;

	/////////////// CONSTRUCTORS ///////////////

	// subClasses all have a name and a price
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	/////////////// TOSTRING ///////////////

	@Override
	public String toString() {
		return "\nname = " + name + "\nprice = " + price + "\n";
	}

}
