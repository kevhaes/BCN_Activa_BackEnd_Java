import javax.swing.JOptionPane;

public class Fase4 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("what is your name please?");
		String sirName1 = JOptionPane.showInputDialog("what is your first sirname please?");
		String sirName2 = JOptionPane.showInputDialog("what is your second sirname please?");

		int day = Integer.parseInt(JOptionPane.showInputDialog("what birth day?"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("what birth month?"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("what birth year?"));

		String fullName = name + " " + sirName1 + "-" + sirName2;
		String fullBirthday = day + "/" + month + "/" + year;

		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			System.out.println(
					"hello " + fullName + " ,your birthday is: \n" + fullBirthday + " and this is a leap year ");

		} else {
			System.out.println(
					"hello " + fullName + " ,your birthday is: \n" + fullBirthday + " and this is not a leap year ");

		}

	}

}
