package bucleFor;

import java.util.Scanner;

public class Ejercicio8 {

	@SuppressWarnings("resource")
	public void drawLines() {
		int n, line, space, asterisk;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter the number of asterisks: ");
		n = scanner.nextInt();
		for (line = 1; line <= n; line++) {
			for (space = 1; space <= n - line; space++) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			for (asterisk = 2; asterisk <= line; asterisk++) {
				System.out.printf(" *");
			}
			System.out.printf("%n");
		}
	
	}

	public void show() {
		drawLines();
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}

}