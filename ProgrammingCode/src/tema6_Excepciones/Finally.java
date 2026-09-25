package tema6_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	@SuppressWarnings("resource")
	public void show() {

		int number = 0;
		String str;
		boolean error = false;
		Scanner keyboard = new Scanner(System.in);

		try {
			System.out.print("Introduce un número: ");
			number = keyboard.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Error");
			error = true;
		} finally {
			keyboard.nextLine();//Limpieza del buffer
		}

		System.out.print("Introduce una cadena: ");
		str = keyboard.nextLine();

		System.out.printf("El número introducido ha sido: %s\n", error ? "error" : number);
		System.out.printf("La cadena introducida ha sido: %s", str);

	}

	public static void main(String[] args) {

		new Finally().show();

	}

}
