package tema1_2_Funciones;

import java.util.Scanner;

public class Factorial {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int n, variable;

		System.out.println("Llamada a la función con argumentos literales: ");
		System.out.printf("El factorial de 5 es %d\n", factorial(5));

		System.out.println("Llamada a la función usando una variable como argumento: ");
		variable = 5;
		System.out.printf("El factorial de %d es %d\n", variable, factorial(variable));

		System.out.println("Llamada a la función usando una expresión como argumento: ");
		variable = 3;
		System.out.printf("El factorial de %d es %d\n", variable + 2, factorial(variable + 2));

		System.out.println("Llamada a la función con argumentos introducidos por el usuario: ");
		do {
			System.out.println("Introduzca un número entero positivo: ");
			n = keyboard.nextInt();
		} while (n <= 0);

		System.out.printf("El factorial de %d es %d", n, factorial(n));		
		
	}
	
	public int factorial(int n) {

		int result = 1;

		for (int i = 2; i <= n; i++) {
			result *= i;
		}

		return result;
	}
	
	public static void main(String[] args) {

		new Factorial().show();

	}

}
