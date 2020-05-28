
public class Fase3 {

	public static void main(String[] args) {
		int refYear = 1948;
		int myYear = 1978;
		boolean isLeap = false;

		for (int i = refYear; i <= myYear; i++) {
			if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
				isLeap = true;

			} else {
				isLeap = false;

			}
			if (isLeap == true) {
				System.out.println(i + " is a leap year");
			} else {
				System.out.println(i + " is a normal year");
			}
		}

	}
}
