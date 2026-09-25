package tema3_3_Recursividad;

import java.util.Scanner;

public class RecursiveFactorial1 {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int n;

		do {
			System.out.println("Introduzca un número entero positivo: ");
			n = keyboard.nextInt();
		} while (n <= 0);

		System.out.printf("El factorial de %d es %d", n, factorial(n));
		
	}

	public int factorial(int n) {

		int result;

		if (n == 1 || n == 0) { //Caso base: devuelve un 1
			result = 1;
		} else { //Caso recursivo
			result = n * factorial(n - 1);
		}

		return result;
	}
	
	public static void main(String[] args) {

		new RecursiveFactorial1().show();

	}

}
