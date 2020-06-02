import java.util.Scanner;

public class CiutatsFase1 {

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
		System.out.println("These are very nice cities:\n" + City1 + "\n" + City2 + "\n" + City3 + "\n" + City4 + "\n"
				+ City5 + "\n" + City6);
	}

}
