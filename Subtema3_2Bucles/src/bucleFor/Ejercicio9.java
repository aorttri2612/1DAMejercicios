package bucleFor;

import java.util.Scanner;

public class Ejercicio9 {

	int row, col, size;
	Scanner keyboard = new Scanner(System.in);

	public void drawRhombus(int n) {
		for (row = 1; row <= n; row++) {
			for (col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (row = n - 1; row >= 1; row--) {
			for (col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void show() {
		System.out.println("Introduce el tamaño:");
		size = keyboard.nextInt();
		keyboard.close();
		drawRhombus(size);
	}

	public static void main(String[] args) {
		new Ejercicio9().show();
	}
}