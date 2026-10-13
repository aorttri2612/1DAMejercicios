package sentenciasCondicionalesSimples;

import java.util.Scanner;

public class Ejercicio1 {
	public void show () {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double decimal, result;
		System.out.print("Introduce un numero decimal: ");
		decimal = keyboard.nextDouble();
		
		if(decimal > 1000) {
			result = decimal * 0.15;
			System.out.printf("El 15% de este número es: %.2f", result);
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
