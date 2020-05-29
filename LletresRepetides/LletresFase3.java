import java.util.HashMap;

import javax.swing.JOptionPane;

public class LletresFase3 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("please input name");
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {
			char lettre = name.charAt(i);
			if (charCount.containsKey(lettre)) {
				int actualValue = charCount.get(lettre);
				actualValue++;
				charCount.replace(lettre, actualValue);
			} else {
				charCount.put(lettre, 1);
			}
		}
		System.out.println(charCount);
	}

}
