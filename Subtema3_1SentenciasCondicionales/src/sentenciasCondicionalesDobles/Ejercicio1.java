package sentenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio1 {
	public void show () {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num;
		num = keyboard.nextInt();
		System.out.print("Introduce un numero entero: ");
		
		if(num % 2 == 0) {
			
			System.out.printf("The number %d es even", num);
		} else {
			System.out.printf("The number %d is odd", num);
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}