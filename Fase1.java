import javax.swing.JOptionPane;

public class Fase1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what is your name please?");
		String sirName1 = JOptionPane.showInputDialog("what is your first sirname please?");
		String sirName2 = JOptionPane.showInputDialog("what is your second sirname please?");

		int day = Integer.parseInt(JOptionPane.showInputDialog("what birth day?"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("what birth month?"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("what birth year?"));

		System.out.println("hello " + name + " " + sirName1 + "-" + sirName2 + " ,your birthday is: \n" + day + "/"
				+ month + "/" + year);

	}

}
