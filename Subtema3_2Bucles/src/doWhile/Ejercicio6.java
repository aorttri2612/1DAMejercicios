package doWhile;

import java.util.Scanner;

public class Ejercicio6 {

	@SuppressWarnings("resource")
	public void grades1To10() {
		double grade, passedSum = 0, failedSum = 0;
		int passed = 0, failed = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter a grade between 1 and 10: ");
			grade = scanner.nextDouble();

			if (grade >= 5 && grade <= 10) {
				passed++;
				passedSum += grade;
			} else if (grade >= 1 && grade < 5) {
				failed++;
				failedSum += grade;
			}

		} while (grade >= 1 && grade <= 10);

		System.out.println("Grade out of range. Program finished");
		System.out.printf("Passed: %d%n", passed);
		System.out.printf("Failed: %d%n", failed);

		if (passed > 0) {
			System.out.printf("Average of passed grades: %.2f%n", passedSum / passed);
		} else {
			System.out.println("There are no passed grades");
		}

		if (failed > 0) {
			System.out.printf("Average of failed grades: %.2f%n", failedSum / failed);
		} else {
			System.out.println("There are no failed grades");
		}

	}

	public void show() {
		grades1To10();
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}
}