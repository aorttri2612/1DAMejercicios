package tema2_1_EscrituraEnPantalla.colores;

import static tema2_1_EscrituraEnPantalla.colores.Colors.RESET_TEXT;

public class RGBMixingTheThreeColours {

	public void show() {

		mixingTheThreeColours(139,69,19);//Marrón
		mixingTheThreeColours(128, 128, 128);//Gris
		mixingTheThreeColours(255, 165, 0);//Naranja
		mixingTheThreeColours(255, 192, 203);//Rosa
		mixingTheThreeColours(255, 0, 255);//Fucsia
		mixingTheThreeColours(64, 224, 208);//Turquesa		
		
	}
	
	public void mixingTheThreeColours(int red,int green,int blue) {
		
		final String RGB_MODE = "\u001B[38;2;"; 
		final String ESCAPED_RGB_MODE = "\\u001B[38;2;";
		final char blockCharacter='\u2588';
		String sequence;
		sequence = String.format("%s%d;%d;%dm", ESCAPED_RGB_MODE, red, green, blue);
		System.out.printf("%s%-24s: %s%d;%d;%dm%c\n", RESET_TEXT, sequence, RGB_MODE, red, green, blue, blockCharacter);
		
	}

	public static void main(String[] args) {

		new RGBMixingTheThreeColours().show();

	}

}