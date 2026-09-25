package tema3_2_Bucles;

import java.util.Random;

public class While1 {
	
	public void show() {
		
		int number;
		Random random = new Random();

		/* 
		 * Se obtiene un número aleatorio entre 1 y 500.
		 * Mientras dicho número sea par, continuamos
		 * en el bucle while.
		 */
		while ((number = random.nextInt(500) + 1) % 2 == 0) {
			System.out.println(number);
		}		
		
	}

	public static void main(String[] args) {

		new While1().show();

	}

}
