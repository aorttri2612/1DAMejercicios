package bucleFor;


public class Ejercicio12 {

	int row, column;
	char letter;

	public void drawBoard() {
		// Cabecera con las letras
		System.out.printf("  ");
		for (letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf("%c ", letter);
		}
		System.out.printf("%n");

		// Filas del 8 al 1
		for (row = 8; row >= 1; row--) {
			System.out.printf("%d ", row);
			for (column = 1; column <= 8; column++) {
				if ((row + column) % 2 == 0) {
					System.out.printf("%s  %s", Colors.BLACK_BACKGROUND, Colors.RESET); // negro
				} else {
					System.out.printf("%s  %s", Colors.WHITE_BACKGROUND, Colors.RESET); // blanco
				}
			}
			System.out.printf(" %d%n", row);
		}

		// Pie con las letras
		System.out.printf("  ");
		for (letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf("%c ", letter);
		}
		System.out.printf("%n");
	}

	public void show() {
		drawBoard();
	}

	public static void main(String[] args) {
		new Ejercicio12().show();
	}

}