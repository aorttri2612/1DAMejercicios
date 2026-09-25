package tema3_2_Bucles;

import java.util.Random;

public class DoWhile1 {
	
	public void show() {
		
		boolean exit;
		int number;
		Random random = new Random();

		do {
			number = random.nextInt(500) + 1;//Se calcula un número aleatorio entre 1 y 500
			System.out.println(number);
			exit = (number % 7 == 0); //exit se pone a true si el número es múltiplo de 7
		} while (!exit);// Condición de repetición: que exit sea false		
		
	}

	public static void main(String[] args) {

		new DoWhile1().show();

	}

}
