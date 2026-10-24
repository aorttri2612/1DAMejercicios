package sentenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio2 {
@SuppressWarnings("resource")
	
	public void show() {
			Scanner keyboard = new Scanner(System.in);
			int integer1, integer2;
			
			System.out.println("Enter a number:");
			integer1 = keyboard.nextInt();
			
			System.out.println("Enter a second number:");
			integer2 = keyboard.nextInt();
			
			if (integer1 % integer2 == 0) {
				System.out.printf("The number %d is a multiple number of %d", integer1, integer2);
			} else {
				System.out.printf("The number %d is a simple number of %d", integer1, integer2);
			}
		}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
