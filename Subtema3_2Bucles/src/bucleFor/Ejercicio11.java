package bucleFor;

import java.util.Scanner;

public class Ejercicio11 {

	int row, col, size;
	Scanner keyboard = new Scanner(System.in);

	public void drawPyramid(int n) {
		for (row = 1; row <= n; row++) {
			for (col = 1; col <= n - row; col++) {
				System.out.print("   ");
			}
			for (col = 1; col <= row; col++) {
				System.out.printf("%d  ", col);
			}
			for (col = row - 1; col >= 1; col--) {
				System.out.printf("%d  ", col);
			}
			System.out.println();
		}
	}

	public void show() {
		System.out.println("Introduce el tamaño:");
		size = keyboard.nextInt();
		keyboard.close();
		drawPyramid(size);
	}

	public static void main(String[] args) {
		new Ejercicio11().show();
	}
}