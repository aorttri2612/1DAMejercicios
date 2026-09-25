package tema6_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Resumption {

	@SuppressWarnings("resource")
	public void show() {

		byte number = 0;
		Scanner keyboard = new Scanner(System.in);
		boolean error = false;

		do {
			try {
				System.out.print("Introduce un número de tipo byte, es decir, entre -128 y 127: ");
				number = keyboard.nextByte();
				System.out.printf("Valor del número: %d\n", number);
				error = false; //Si se ha entrado antes en el catch, error está a true
			} catch (InputMismatchException e) {
				System.err.println("Error");
				error = true;
				keyboard.nextLine(); //Limpieza del buffer
			}
		} while (error);

	}

	public static void main(String[] args) {

		new Resumption().show();

	}

}
