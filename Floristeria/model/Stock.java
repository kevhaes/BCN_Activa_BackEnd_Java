/**
 * @author KevHaes
 *
 */
package floristeria.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KevHaes
 *
 */
public class Stock {
	/////////////// ATRIBUTES ///////////////

	// creating productStock list
	// -->!! not yet instantiated! (will be done while constructing Shop/Controller)
	static List<Product> productsStock = new ArrayList<>();
	/////////////// CONSTRUCTORS ///////////////

	/////////////// GETTERS & SETTERS ///////////////

	// get all products from stock
	public static List<Product> getAllProductsInStock() {
		return productsStock;
	}

	/////////////// METHODS ///////////////

	// adding product items to stock
	public void addProduct(Product item) {
		productsStock.add(item);

	}

	/////////////// TOSTRING ///////////////

}
