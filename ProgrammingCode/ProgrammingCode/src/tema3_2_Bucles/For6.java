package tema3_2_Bucles;

import java.util.Random;

public class For6 {
	
	public void show() {
	
		int number = 0, i;
		Random random = new Random();

		for (i = 1; i <= 5; i++) {
			number = random.nextInt(500) + 1;
			System.out.printf("Iteración %d, número: %d\n", i, number);
			if (number % 7 == 0) {
				i = 5;//No se pueden modificar las variables del for, solamente en el incremento
			}
		}
		if (number % 7 == 0) {
			System.out.printf("El múltiplo de 7 encontrado vale %d", number);
		} else {
			System.out.println("El múltiplo de 7 no se ha encontrado");
		}		
		
	}

	public static void main(String[] args) {

		new For6().show();

	}

}
