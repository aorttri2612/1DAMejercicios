package tema3_2_Bucles;

import java.util.Random;

public class For4 {
	
	public void show() {
		
		boolean exit = false;
		int number = 0, i;
		Random random = new Random();

		for (i = 1; !exit; i++) {//Este for no es legible, se debe sustituir por un do-while
			number = random.nextInt(500) + 1;
			System.out.printf("Iteración %d, número: %d\n", i, number);
			exit = (number % 7 == 0);
		}
		System.out.printf("El múltiplo de 7 con valor %d se ha encontrado en la iteración %d", number, i - 1);		
		
	}

	public static void main(String[] args) {

		new For4().show();

	}

}
