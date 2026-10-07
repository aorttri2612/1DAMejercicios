package metodosDeString;

import java.util.Random;

public class Ejercicio2 {

	public void show() {
		String text = "Programación";

		Random random = new Random();

		int position = random.nextInt(text.length());

		System.out.printf("Carácter elegido: %c%n", text.charAt(position));
	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
