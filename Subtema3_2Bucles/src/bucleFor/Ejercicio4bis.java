package bucleFor;

import java.util.Scanner;

public class Ejercicio4bis {
	/*Ejercicio excluyendo los numeros en los 
	 * q empieza el bucle y mostrando los numeros pares e impares*/
	int sum;
	@SuppressWarnings("resource")
	public void requestNumbers() {

		Scanner scanner = new Scanner(System.in);
		int n1, n2, evenSum, oddSum;

		do {
			System.out.printf("Enter n1: ");
			n1 = scanner.nextInt();
			System.out.printf("Enter n2: ");
			n2 = scanner.nextInt();

			if (n1 > n2) {
				System.out.printf("n1 must be less than or equal to n2.%n");
			}

		} while (n1 > n2);

		System.out.printf("Even numbers between %d and %d:", n1, n2);
		evenSum = sumEven(n1, n2);
		System.out.printf("%nSum of even numbers: %d%n", evenSum);

		System.out.printf("Odd numbers between %d and %d:", n1, n2);
		oddSum = sumOdd(n1, n2);
		System.out.printf("%nSum of odd numbers: %d%n", oddSum);
	}

	public int sumEven(int a, int b) {
		sum = 0;
		for (int i = a + 1; i < b; i++) { // dentro del for siempre se usa la i para las condiciones
			if (i % 2 == 0) {
				System.out.printf(" %d", i);
				sum += i;
			}
		}
		return sum;
	}

	public int sumOdd(int a, int b) {
		sum = 0;
		for (int i = a + 1; i < b; i++) {
			if (i % 2 != 0) {
				System.out.printf(" %d", i);
				sum += i;
			}
		}
		return sum;
	}

	public void show() {
		requestNumbers();
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}