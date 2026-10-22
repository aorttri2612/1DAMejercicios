package doWhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
	@SuppressWarnings("resource")
	public void guessNumber() {
		
		int secretNumber, guess, attempts = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);


		secretNumber = random.nextInt(100) + 1;

		do {
			System.out.println("Guess the number between 1 and 100: ");
			guess = scanner.nextInt();
			attempts++;

			if (guess < secretNumber) {
				System.out.println("The secret number is higher");
			} else if (guess > secretNumber) {
				System.out.println("The secret number is lower");
			}

		} while (guess != secretNumber);

		System.out.printf("Correct! You needed %d attempts.%n", attempts);
	}

	public void show() {
		guessNumber();
	}

	public static void main(String[] args) {
		new Ejercicio9().show();
	}
}