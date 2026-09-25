package tema3_2_Bucles;

import java.util.Scanner;

public class DoWhile3 {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int number;
		do {
			System.out.print("Introduzca un número del 1 al 5: ");
			number = keyboard.nextInt();
			System.out.printf("Has introducido un %d\n", number);
		} while (number < 1 || number > 5);	
		
	}
	
	public static void main(String[] args) {

		new DoWhile3().show();

	}

}
