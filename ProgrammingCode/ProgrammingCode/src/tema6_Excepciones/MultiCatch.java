package tema6_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	@SuppressWarnings("resource")
	public void show() {

		final String FIN = "fin";
		int base, exponent;
		String baseString;
		Scanner keyboard = new Scanner(System.in);

		try {
			System.out.println("Bienvenido al programa para calcular una potencia.");
			System.out.print("Introduce la base o fin para terminar: ");
			baseString = keyboard.nextLine();
			if (!baseString.toLowerCase().equals(FIN)) {
				base = Integer.parseInt(baseString);
				System.out.print("Introduce el exponente: ");
				exponent = keyboard.nextInt();
				System.out.printf("%d elevado a %d es igual a %d", base, exponent, (int) Math.pow(base, exponent));
			}
		} catch (NumberFormatException | InputMismatchException e) {
			System.err.println("Error en la base o en el exponente");
		}

	}

	public static void main(String[] args) {

		new MultiCatch().show();

	}

}
