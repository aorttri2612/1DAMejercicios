package tema3_2_Bucles;

import java.util.Random;

public class For5 {
	
	public void show() {
		
		boolean exit = false;
		int number = 0, i;
		Random random = new Random();
		/*
		 * Ahora el for sí es legible porque la variable i
		 * aparece en las 3 partes: en la inicialización,
		 * en la condición y en el incremento
		 */
		for (i = 1; i <= 5 && !exit; i++) {
			number = random.nextInt(500) + 1;
			System.out.printf("Iteración %d, número: %d\n", i, number);
			exit = (number % 7 == 0);
		}
		if (exit) {
			System.out.printf("El múltiplo de 7 con valor %d se ha encontrado en la iteración %d", number, i - 1);
		} else {
			System.out.println("El múltiplo de 7 no se ha encontrado");
		}		
		
	}

	public static void main(String[] args) {

		new For5().show();
		
	}

}
