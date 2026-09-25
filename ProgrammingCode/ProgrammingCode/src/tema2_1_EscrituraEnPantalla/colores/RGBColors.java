package tema2_1_EscrituraEnPantalla.colores;

import static tema2_1_EscrituraEnPantalla.colores.Colors.RESET_TEXT; 

public class RGBColors {

	public void show() {

		final String RGB_MODE = "\u001B[38;2;"; 
		final String ESCAPED_RGB_MODE = "\\u001B[38;2;";
		final char BLOCK_CHARACTER='\u2588';
		String sequence,print;
		for (int i = 0; i <= 2; i++) {
			switch (i) {
				case 0 -> {
					System.out.println("Rojo:");
					for (int j = 0; j <= 255; j++) {
						sequence = String.format("%s%d%s", ESCAPED_RGB_MODE, j, ";0;0m");
						print = String.format("%-22s: %s%d%s%c", sequence, RGB_MODE, j, ";0;0m",BLOCK_CHARACTER);
						System.out.println(print);
					}
				}
				case 1 -> {
					System.out.printf("%sVerde:\n",RESET_TEXT);
					for (int j = 0; j <= 255; j++) {
						sequence = String.format("%s%s%d%s", ESCAPED_RGB_MODE, "0;", j, ";0m");
						print = String.format("%-22s: %s%s%d%s%c", sequence, RGB_MODE, "0;", j, ";0m",BLOCK_CHARACTER);
						System.out.println(print);
					}
				}
				case 2 -> {
					System.out.printf("%sAzul:\n",RESET_TEXT);
					for (int j = 0; j <= 255; j++) {
						sequence = String.format("%s%s%d%s", ESCAPED_RGB_MODE, "0;0;", j, "m");
						print = String.format("%-22s: %s%s%d%s%c", sequence, RGB_MODE, "0;0;", j, "m",BLOCK_CHARACTER);
						System.out.println(print);
					}
				}
				default -> {
					System.out.println("Color erróneo");
				}
			};
			
		}

	}

	public static void main(String[] args) {

		new RGBColors().show();

	}

}