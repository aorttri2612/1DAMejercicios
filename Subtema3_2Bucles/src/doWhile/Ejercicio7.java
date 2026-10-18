package doWhile;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Ejercicio7 {

	final int CORRECT_PIN = 1234, MAX_ATTEMPTS = 3;
	int enteredPin, attempts = 0;
	Scanner scanner = new Scanner(System.in);

	public void checkPin() {

		do {
			System.out.println("Enter your PIN: ");
			enteredPin = scanner.nextInt();
			attempts++;

			if (enteredPin != CORRECT_PIN && attempts < MAX_ATTEMPTS) {
				System.out.printf("Incorrect PIN. Attempts left: %d%n", MAX_ATTEMPTS - attempts);
			}

		} while (enteredPin != CORRECT_PIN && attempts < MAX_ATTEMPTS);

		if (enteredPin == CORRECT_PIN) {
			System.out.println("Correct PIN. Access granted");
		} else {
			System.out.println("Too many failed attempts. Card blocked");
		}
	}

	public void show() {
		checkPin();
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}
}