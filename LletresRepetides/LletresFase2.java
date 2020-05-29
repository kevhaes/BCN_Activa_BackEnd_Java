import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class LletresFase2 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("please input name");
		char letter;

		List<Character> nameChars = new ArrayList<>();
		for (int i = 0; i < name.length(); i++) {

			letter = name.charAt(i);
			if (letter == ' ') {
				nameChars.add(' ');
			} else {
				nameChars.add(letter);
			}
		}
		for (char lettre : nameChars) {
			if ((lettre == 'e') | (lettre == 'i') | (lettre == 'u') | (lettre == 'o') | (lettre == 'a')) {
				System.out.println(lettre + " is a vowel");
			} else if (lettre == ' ') {
				System.out.println("here is a space");
			} else {
				System.out.println(lettre + " is a consonant");
			}
		}
		for (char lettre : nameChars) {
			if (Character.isDigit(lettre)) {
				System.out.println(" \nYour name contains numbers!!");
			}

		}

	}
}
