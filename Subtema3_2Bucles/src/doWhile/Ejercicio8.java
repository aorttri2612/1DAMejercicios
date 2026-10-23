package doWhile;

import java.util.Scanner;

public class Ejercicio8 {

	@SuppressWarnings("resource")
	public void menuAndCalculator() {
		int option;
		double number1, number2;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Menú");
			System.out.println("1. Add 2. Subtract 3. Exit");
			System.out.println("Choose an option: ");
			option = scanner.nextInt();

			switch (option) {
			case 1 -> {
				System.out.println("Enter the first number: ");
				number1 = scanner.nextDouble();
				System.out.println("Enter the second number: ");
				number2 = scanner.nextDouble();
				System.out.printf("Result: %.2f%n", number1 + number2);
			}
			case 2 -> {
				System.out.println("Enter the first number: ");
				number1 = scanner.nextDouble();
				System.out.println("Enter the second number: ");
				number2 = scanner.nextDouble();
				System.out.printf("Result: %.2f%n", number1 - number2);
			}
			case 3 -> System.out.println("Program finished");
			default -> System.out.println("Invalid option");
			}

		} while (option != 3);
	}

	public void show() {
		menuAndCalculator();
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}
}