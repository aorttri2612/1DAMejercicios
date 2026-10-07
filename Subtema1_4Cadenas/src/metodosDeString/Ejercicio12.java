package metodosDeString;

public class Ejercicio12 {

	public void show() {
		String text = "Programación en Java";

		String result = text.substring(5, 10);

		System.out.printf("Cadena: %s%n", text);
		System.out.printf("Subcadena: %s%n", result);
	}

	public static void main(String[] args) {
		new Ejercicio12().show();
	}

}