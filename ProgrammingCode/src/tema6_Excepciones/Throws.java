package tema6_Excepciones;

import java.util.Scanner;

public class Throws {

	@SuppressWarnings("resource")
	public void show() {

		final String FIN = "fin", SIGUIENTE = "siguiente";
		int number;
		String str;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un número o siguiente para pasar al siguiente número: ");
		str = keyboard.nextLine();
		if (!str.toLowerCase().equals(SIGUIENTE)) {
			/*
			 * Aquí no estamos obligados a poner un try-catch porque 
			 * NumberFormatException es hija de RuntimeException:
			 */
			number = convertirNumero(str);
			System.out.printf("Valor del número introducido: %d\n", number);
		}
		
		try {
			System.out.print("Introduce un número o fin para terminar: ");
			str = keyboard.nextLine();
			if (!str.toLowerCase().equals(FIN)) {
				/*
				 * Aquí sí estamos obligados a poner un try-catch porque 
				 * Exception no es hija de RuntimeException:
				 */
				number = convertirNumero2(str);
				System.out.printf("Valor del número introducido: %d\n", number);
			}
		} catch (Exception e) {
			System.err.println("Error en el número");
		}

	}

	public int convertirNumero(String str) throws NumberFormatException {

		return Integer.parseInt(str);

	}

	public int convertirNumero2(String str) throws Exception {

		return Integer.parseInt(str);

	}

	public static void main(String[] args) {

		new Throws().show();

	}

}
