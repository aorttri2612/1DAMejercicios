package tema2_1_EscrituraEnPantalla.colores;

import static tema2_1_EscrituraEnPantalla.colores.Colors.RESET_TEXT;

public class YellowColor {

	public void show() {

		final String RGB_MODE = "\u001B[38;2;"; 
		final String ESCAPED_RGB_MODE = "\\u001B[38;2;";
		final char blockCharacter='\u2588';
		String sequence = String.format("%s%s", ESCAPED_RGB_MODE, "255;255;0m");
		System.out.printf("%sAmarillo puro: %-22s: %s%s%c\n", RESET_TEXT, sequence, RGB_MODE, "255;255;0m",blockCharacter);
		sequence = String.format("%s%s", ESCAPED_RGB_MODE, "255;255;153m");
		System.out.printf("%sAmarillo más clarito: %-22s: %s%s%c\n", RESET_TEXT, sequence, RGB_MODE, "255;255;153m",blockCharacter);

	}

	public static void main(String[] args) {

		new YellowColor().show();

	}

}