package bucleFor;

import java.util.Scanner;

public class Ejercicio2 {
	
	@SuppressWarnings("resource")
	public void requestNumber() {
		int number;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter a number from 0 to 10: ");
            number = scanner.nextInt();

        } while (number < 0 || number > 10);
        printTable(number);
	}
	
	public void printTable(int n) {
		
		  System.out.printf("The multiplication table of %d is:%n", n);

	        for (int i = 0; i <= 10; i++) {
	            System.out.printf("%d  x %3d = %d%n", n, i, n * i);
	        }
		
	}
	
	public void show() {
		 requestNumber();
	}
		

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
