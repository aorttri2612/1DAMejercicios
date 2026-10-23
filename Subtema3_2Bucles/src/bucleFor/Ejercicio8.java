package bucleFor;

import java.util.Scanner;

public class Ejercicio8 {


	public void drawPiramid(int n) {
		int line, space, asterisk;
		
		for (line = 1; line <= n; line++) {
			for (space = 1; space <= n-line; space++) {
				System.out.printf(" ");
			}
			for (asterisk = 1; asterisk <= line; asterisk++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
	
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of asterisks: ");
		int n = scanner.nextInt();
		drawPiramid(n);
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}

}