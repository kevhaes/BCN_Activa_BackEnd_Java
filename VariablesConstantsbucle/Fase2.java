public class Fase2 {

	public static void main(String[] args) {
		final int RefYear = 1948;
		int interval = 4;
		int MyYear = 1978;
		int numberOfLeapYears = (MyYear - RefYear) / 2;

		System.out.println("there are " + numberOfLeapYears + " leap years between " + RefYear + " and " + MyYear);

	}

}
