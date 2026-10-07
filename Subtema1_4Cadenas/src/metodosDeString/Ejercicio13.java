package metodosDeString;

public class Ejercicio13 {

	public void show() {
		String text1 = "Programación en Java";
		String text2 = "JAVA";

		boolean result = text1.regionMatches(true, 17, text2, 0, 4);

		System.out.printf("¿Coinciden las regiones?: %b%n", result);
	}

	public static void main(String[] args) {
		new Ejercicio13().show();
	}

}