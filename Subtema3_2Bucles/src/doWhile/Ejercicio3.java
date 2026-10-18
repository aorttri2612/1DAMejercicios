package doWhile;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Ejercicio3 {
	double grade;
	Scanner scanner = new Scanner(System.in);
	
	public void enterGrades() {
	    
        do {
            System.out.printf("Enter a grade between 0 and 10: ");
            grade = scanner.nextDouble();
        } while (grade >= 0 && grade <= 10);

        System.out.printf("Invalid grade. Program finished.%n");
    }
	
	public void show() {
		
		enterGrades();
	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
