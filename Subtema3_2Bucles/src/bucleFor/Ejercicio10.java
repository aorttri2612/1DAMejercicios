package bucleFor;

import java.util.Scanner;

public class Ejercicio10 {

	int row, col, size;
	Scanner keyboard = new Scanner(System.in);

	public void drawNumberTriangle(int n) {
		for (row = 1; row <= n; row++) {
			for (col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
			for (col = 1; col <= row; col++) {
				System.out.printf("%-4d", col);
			}
			System.out.println();
		}
	}

	public void show() {
		System.out.println("Introduce el tamaño:");
		size = keyboard.nextInt();
		keyboard.close();
		drawNumberTriangle(size);
	}

	public static void main(String[] args) {
		new Ejercicio10().show();
	}
}