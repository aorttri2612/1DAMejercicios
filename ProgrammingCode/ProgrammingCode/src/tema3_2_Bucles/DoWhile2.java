package tema3_2_Bucles;

import java.util.Random;

public class DoWhile2 {
	
	public void show() {
		
		boolean exit;
		int number, i = 1;//i es un índice porque apunta al número de iteración del bucle
		Random random = new Random();

		do {
			number = random.nextInt(500) + 1;
			System.out.println(number);
			exit = (number % 7 == 0);
			i++;
		} while (!exit && i <= 5);//Mientras exit sea false y además i sea menor o igual a 5

		if (!exit) {
			System.out.println("No se encontró el múltiplo de 7");
		}
		
	}

	public static void main(String[] args) {

		new DoWhile2().show();

	}

}
