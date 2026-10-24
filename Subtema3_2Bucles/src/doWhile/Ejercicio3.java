package doWhile;

import java.util.Scanner;

public class Ejercicio3 {
	@SuppressWarnings("resource")
	public void enterGrades() {
		double grade;
		Scanner scanner = new Scanner(System.in);
	    
        do {
            System.out.println("Enter a grade between 0 and 10: ");
            grade = scanner.nextDouble();
        } while (grade >= 0 && grade <= 10);

        System.out.println("Invalid grade. Program finished: ");
    }
	
	public void show() {
		
		enterGrades();
	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
