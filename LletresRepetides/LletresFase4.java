import java.util.HashMap;

import javax.swing.JOptionPane;

public class LletresFase4 {

	public static void main(String[] args) {
		String Sirname = JOptionPane.showInputDialog("please input Sirname");
		String Firstname = JOptionPane.showInputDialog("please input First name");
		HashMap<Integer, Character> charCount = new HashMap<Integer, Character>();
		int position = 0;

		for (int i = 0; i < Sirname.length(); i++) {
			position++;
			char letter = Sirname.charAt(i);
			charCount.put(position, letter);

		}
		System.out.println("positions for letters in Sirname:\n" + charCount);
		position++;
		charCount.put(position, ' ');
		for (int i = 0; i < Firstname.length(); i++) {
			position++;
			char letter = Firstname.charAt(i);
			charCount.put(position, letter);

		}

		System.out.println("fullname:\n" + charCount.values());
		System.out.println("positions for letters are:\n" + charCount);
	}
}
