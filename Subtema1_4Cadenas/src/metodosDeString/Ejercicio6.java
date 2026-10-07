package metodosDeString;

public class Ejercicio6 {

	public void show() {
		String text = "Programación";

		int position = text.indexOf('r');

		System.out.printf("La posición de 'r' es: %d%n", position);
	}

	public static void main(String[] args) {
		new Ejercicio6().show();

	}

}
