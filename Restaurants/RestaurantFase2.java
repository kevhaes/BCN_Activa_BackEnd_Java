import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantFase2 {

	public static void main(String[] args) {
		int banknote5 = 5;
		int banknote10 = 10;
		int banknote20 = 20;
		int banknote50 = 50;
		int banknote100 = 100;
		int banknote200 = 200;
		int banknote500 = 500;
		int totalMeal;
		String[] meals = new String[5];
		int[] mealPrices = new int[5];

		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Insert a meal please");
			meals[i] = reader.next();
		}
		for (int i = 0; i < meals.length; i++) {
			System.out.println("Insert price of meal " + (i + 1) + " please");
			mealPrices[i] = Integer.parseInt(reader.next());
		}
		System.out.println("This is the menu of the day:");
		for (int i = 0; i < meals.length; i++) {
			System.out.println(meals[i] + " €" + mealPrices[i]);
		}
		ArrayList<String> orders = new ArrayList<String>();
		int orderCounter = 0;
		int answer = 1;
		while (answer == 1) {
			System.out.println("What do you want to eat?");
			orders.add(reader.next());
			System.out.println("Do you want to continue? for YES type: 1 /for NO type: 0");
			answer = Integer.parseInt(reader.next());
			orderCounter++;
		}
		System.out.println("You ordred " + orderCounter + " plates:");
		for (String order : orders) {
			System.out.println(order);
		}
		reader.close();
	}
}
