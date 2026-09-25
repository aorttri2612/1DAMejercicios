package tema2_1_EscrituraEnPantalla.colores;

import static tema2_1_EscrituraEnPantalla.colores.Colors.*;

public class ColorsUse {

	public void show() {
		
		String color;
		String[] colorNames = {
	            "Negro", "Rojo", "Verde", "Amarillo", "Azul", "Magenta", "Cian", "Blanco"};
		

		System.out.printf("%s%s\n", RED, "Este texto es de color rojo");
		System.out.printf("%s%s\n", RESET_TEXT, "Volvemos al color del texto por defecto");
		System.out.printf("%s%s\n", GREEN, "...y ahora es verde");
		System.out.printf("%s%s\n", PURPLE_BACKGROUND, "Fondo morado");
		System.out.printf("%s%s%s\n", CYAN, WHITE_BACKGROUND, "Fondo blanco con texto celeste");
		System.out.printf("%s%s%s%s\n", CYAN, WHITE_BACKGROUND, BOLD, "Fondo blanco con texto celeste en negrita");
		System.out.printf("%s%s%s%s\n", CYAN, WHITE_BACKGROUND, UNDERLINE, "Fondo blanco con texto celeste subrayado");
		System.out.printf("%s%s\n", RESET_TEXT,
				"Volvemos al color del texto por defecto y se mantiene el fondo como estaba");
		System.out.printf("%s%s%c\n", YELLOW, RED_BACKGROUND, (char) 9733);// Estrella
		System.out.printf("%s%s%s\n", YELLOW, GREEN_BACKGROUND, "Fondo verde con texto amarillo");
		System.out.printf("%s%s\n", REVERSED, "Fondo amarillo con texto verde usando REVERSED");
		System.out.printf("%s%s\n\n", RESET, "Volvemos al color del texto y del fondo por defecto");
		
	    for (int i = 0; i < 8; i++) {
	    	color = String.format("\u001B[3%dm",i);
            System.out.printf("%sEste es el color %s\n",color,colorNames[i]);
        }
	    
	    for (int i = 0; i < 8; i++) {
	    	color = String.format("\u001B[9%dm",i);
            System.out.printf("%sEste es el color %s brillante\n",color,colorNames[i]);
        }

	}

	public static void main(String[] args) {
		
		new ColorsUse().show();

	}
	
}