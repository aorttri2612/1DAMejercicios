package tema3_2_Bucles;

import java.util.Scanner;

public class DoWhile4 {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int number, counter = 0, sum = 0, index = 0;
		/*
		 * index: es un índice porque apunta al número de iteración del bucle
		 * counter: es un contador para contar el número de pares	
		 * sum: es un acumulador donde se acumula la suma de los números pares
		 * 		
		 */
		do {
			System.out.print("Introduzca un número ó 0 para terminar: ");
			number = keyboard.nextInt();
			if (number != 0) {
				index++;//Se incrementa el número de iteración del bucle
				System.out.printf("El número introducido en la iteración %d es %d\n", index, number);
				if (number % 2 == 0) {//Si el número es par
					counter++;//Se incrementa el contador
					sum += number;//Se acumula la suma en el acumulador
				}
			}
		} while (number != 0);

		System.out.printf("En %d iteraciones se han introducido %d números pares cuya suma vale %d", index, counter, sum);		
		
	}
	
	public static void main(String[] args) {

		new DoWhile4().show();

	}

}
