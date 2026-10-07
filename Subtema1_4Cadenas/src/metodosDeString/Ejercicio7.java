package metodosDeString;

public class Ejercicio7 {

	public void show() {
		String text = "Programación en Java";

		System.out.printf("Mayúsculas: %s%n", text.toUpperCase());
		System.out.printf("Minúsculas: %s%n", text.toLowerCase());
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}

}