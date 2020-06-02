import java.util.Arrays;
import java.util.Scanner;

public class CiutatsFase4 {

	public static void main(String[] args) {
		String City1, City2, City3, City4, City5, City6;

		Scanner reader = new Scanner(System.in);

		System.out.println("Insert city1");
		City1 = reader.nextLine();
		System.out.println("Insert city2");
		City2 = reader.nextLine();
		System.out.println("Insert city3");
		City3 = reader.nextLine();
		System.out.println("Insert city4");
		City4 = reader.nextLine();
		System.out.println("Insert city5");
		City5 = reader.nextLine();
		System.out.println("Insert city6");
		City6 = reader.nextLine();
		reader.close();
		String[] cities = { City1, City2, City3, City4, City5, City6 };
		Arrays.sort(cities);

		String[] modifiedCities = new String[6];
		for (int i = 0; i < cities.length; i++) {
			modifiedCities[i] = cities[i].replaceAll("a", "4");
		}
		Arrays.sort(modifiedCities);
//		for (String city : modifiedCities) {
//			System.out.println(city);
//		}

		char[] Barcelona = new char[City1.length()];
		char[] Madrid = new char[City2.length()];
		char[] Valencia = new char[City3.length()];
		char[] Malaga = new char[City4.length()];
		char[] Cadiz = new char[City5.length()];
		char[] Santander = new char[City6.length()];

		for (int i = 0; i < City1.length(); i++) {
			Barcelona[i] = City1.charAt(i);
		}
		for (int i = 0; i < City2.length(); i++) {
			Madrid[i] = City2.charAt(i);
		}
		for (int i = 0; i < City3.length(); i++) {
			Valencia[i] = City3.charAt(i);
		}
		for (int i = 0; i < City4.length(); i++) {
			Malaga[i] = City4.charAt(i);
		}
		for (int i = 0; i < City5.length(); i++) {
			Cadiz[i] = City5.charAt(i);
		}
		for (int i = 0; i < City6.length(); i++) {
			Santander[i] = City6.charAt(i);
		}
		System.out.println("Barcelona:");
		for (int i = Barcelona.length - 1; i >= 0; i--) {
			System.out.print(Barcelona[i]);
		}
		System.out.println("\nMadrid:");
		for (int i = Madrid.length - 1; i >= 0; i--) {
			System.out.print(Madrid[i]);
		}
		System.out.println("\nValencia:");
		for (int i = Valencia.length - 1; i >= 0; i--) {
			System.out.print(Valencia[i]);
		}
		System.out.println("\nMalaga:");
		for (int i = Malaga.length - 1; i >= 0; i--) {
			System.out.print(Malaga[i]);
		}
		System.out.println("\nCadiz:");
		for (int i = Cadiz.length - 1; i >= 0; i--) {
			System.out.print(Cadiz[i]);
		}
		System.out.println("\nSantander:");
		for (int i = Santander.length - 1; i >= 0; i--) {
			System.out.print(Santander[i]);
		}

	}
}
