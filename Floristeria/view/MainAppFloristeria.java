/**
 * @author KevHaes
 *
 */
package floristeria.view;

import floristeria.controller.FlowerShop;

/**
 * @author KevHaes
 *
 */
public class MainAppFloristeria {

	static FlowerShop shop = new FlowerShop("La Floristeria");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// confirm creating shop
		System.out.println("Welcome to " + shop.getName());

		// creating flowers
		shop.createFlower("flower01", 9.99, "red");
		shop.createFlower("flower02", 12.99, "green");
		shop.createFlower("flower03", 8.99, "blue");
		// creating trees
		shop.createTree("tree01", 10.00, 280);
		shop.createTree("tree02", 12.00, 380);
		shop.createTree("tree03", 15.00, 450);
		// creating deco
		shop.createDeco("deco01", 5.00, "wood");
		shop.createDeco("deco02", 10.00, "plastic");
		shop.createDeco("deco03", 30.00, "wood");

		// printing complete stock
		System.out.println(shop.getName() + " COMPLETE STOCK:\n" + shop.getStock());

	}

}
