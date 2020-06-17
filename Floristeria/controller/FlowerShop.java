/**
 * @author KevHaes
 *
 */
package floristeria.controller;

import floristeria.model.Deco;
import floristeria.model.Flower;
import floristeria.model.Product;
import floristeria.model.Stock;
import floristeria.model.Tree;

/**
 * @author KevHaes
 *
 */
//acts as a stockcontroller
public class FlowerShop {

	/////////////// ATRIBUTES ///////////////
	
	private String name;
	private Stock productsStock;

	/////////////// CONSTRUCTORS ///////////////

	// create a controller/ shop and initialize the stock list object
	public FlowerShop(String name) {
		this.name = name;
		this.productsStock = new Stock();
	}

	/////////////// GETTERS & SETTERS ///////////////

	// get name of shop/controller
	public String getName() {
		return this.name;
	}

	// getting stock through get method in Stock class
	public String getStock() {
		return Stock.getAllProductsInStock().toString();
	}

	/////////////// METHODS ///////////////

	// creating flower object
	public void createFlower(String name, Double price, String color) {
		Product flower = new Flower(name, price, color);
		productsStock.addProduct(flower);

	}

	// creating tree object
	public void createTree(String name, Double price, int height) {
		Product tree = new Tree(name, price, height);
		productsStock.addProduct(tree);

	}

	// creating deco object
	public void createDeco(String name, Double price, String material) {
		Product deco = new Deco(name, price, material);
		productsStock.addProduct(deco);
	}

}
