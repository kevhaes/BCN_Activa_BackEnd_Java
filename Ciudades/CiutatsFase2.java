import java.util.Arrays;
import java.util.Scanner;

public class CiutatsFase2 {

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
		for (String city : cities) {
			System.out.println(city);
		}

	}

}
