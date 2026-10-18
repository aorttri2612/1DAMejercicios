package doWhile;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Ejercicio10 {

	int originalNumber, number, sum = 0;
	Scanner scanner = new Scanner(System.in);

	public void sumDigits() {

		System.out.println("Enter an integer: ");
		originalNumber = scanner.nextInt();
		number = Math.abs(originalNumber);

		do {
			sum += number % 10;
			number /= 10;

		} while (number > 0);

		System.out.printf("Number: %d%n", originalNumber);
		System.out.printf("Sum of its digits: %d%n", sum);
	}

	public void show() {
		sumDigits();
	}

	public static void main(String[] args) {
		new Ejercicio10().show();
	}
}