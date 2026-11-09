package bucleFor;

import java.util.Scanner;
import static bucleFor.Colors.*;

public class Ejercicio13 {

	@SuppressWarnings("resource")
	public void drawBoard() {
		Scanner sc = new Scanner(System.in);
		int row, column, bishopRow, bishopColumn;
		char letter, bishopLetter;
		// Pedir la casilla del alfil
		do {
			System.out.println("Bishop column (a-h): ");
			bishopLetter = Character.toLowerCase(sc.next().charAt(0));
		} while (bishopLetter < 'a' || bishopLetter > 'h');

		do {
			System.out.println("Bishop row (1-8): ");
			bishopRow = sc.nextInt();
		} while (bishopRow < 1 || bishopRow > 8);

		bishopColumn = bishopLetter - 'a' + 1;

		// Cabecera con las letras
		System.out.println("%n  ");
		for (letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf("%c ", letter);
		}
		System.out.println("%n");

		// Filas del 8 al 1
		for (row = 8; row >= 1; row--) {
			System.out.printf("%d ", row);
			for (column = 1; column <= 8; column++) {
				if (row == bishopRow && column == bishopColumn) {
					System.out.printf("%s  %s", BLUE_BACKGROUND, RESET); // alfil
				} else if (row - bishopRow == column - bishopColumn || row - bishopRow == bishopColumn - column) {
					System.out.printf("%s  %s", RED_BACKGROUND, RESET); // diagonales
				} else if ((row + column) % 2 == 0) {
					System.out.printf("%s  %s", BLACK_BACKGROUND, RESET); // negro
				} else {
					System.out.printf("%s  %s", WHITE_BACKGROUND, RESET); // blanco
				}
			}
			System.out.printf(" %d%n", row);
		}

		// Pie con las letras
		System.out.println("  ");
		for (letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf("%c ", letter);
		}
		System.out.println("%n");
	}

	public void show() {
		drawBoard();
	}

	public static void main(String[] args) {
		new Ejercicio13().show();
	}

}