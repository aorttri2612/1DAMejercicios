package doWhile;

import java.util.Scanner;

public class Ejercicio4 {
	  
	 @SuppressWarnings("resource")
	    public void show() {
	        Scanner scanner = new Scanner(System.in);
	        double grade;
	        int iteration = 0;

	        do {
	            System.out.println("Enter a grade between 0 and 10: ");
	            grade = scanner.nextDouble();

	            if (grade >= 0 && grade <= 10) {
	                iteration++;

	                System.out.printf("In iteration %d you entered grade %.2f%n",iteration, grade);
	            }

	        } while (grade >= 0 && grade <= 10);

	        System.out.println("Invalid grade. Program finished.");
	    }

	public static void main(String[] args) {
		new Ejercicio4().show();

	}

}
