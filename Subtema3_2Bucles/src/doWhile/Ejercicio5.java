package doWhile;

import java.util.Scanner;

public class Ejercicio5 {
	double grade;
    int iteration = 0;
    int passedCount = 0;
    int failedCount = 0;

	 @SuppressWarnings("resource")
	    public void show() {
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.printf("Enter a grade between 0 and 10: ");
	            grade = scanner.nextDouble();

	            if (grade >= 0 && grade <= 10) {
	                iteration++;

	                System.out.printf(
	                    "In iteration %d you entered grade %.2f%n",
	                    iteration, grade
	                );

	                if (grade >= 5) {
	                    passedCount++;
	                } else {
	                    failedCount++;
	                }
	            }

	        } while (grade >= 0 && grade <= 10);

	        System.out.printf("Total passed: %d%n", passedCount);
	        System.out.printf("Total failed: %d%n", failedCount);
	    }

	    public static void main(String[] args) {
	        new Ejercicio5().show();
	    }
	}