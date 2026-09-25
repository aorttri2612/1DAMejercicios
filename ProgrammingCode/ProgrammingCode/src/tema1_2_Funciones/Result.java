package tema1_2_Funciones;

import static tema2_1_EscrituraEnPantalla.colores.Colors.*;

import java.util.Scanner;

public class Result {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		String str, strRed;

		System.out.print("Introduce una cadena: ");
		str = keyboard.nextLine();
		/*
		 * En la llamada a la función turnRed,
		 * no estamos utilizando el valor devuelto:
		 */
		turnRed(str);
		
		//En la siguiente llamada sí lo vamos a utilizar:
		strRed = turnRed(str);
		System.out.printf("La cadena \"%s\" convertida a rojo: %s", str, strRed);		
		
	}
	
	public String turnRed(String str) {

		return String.format("%s%s%s\n",RED,str,RESET);

	}

	public static void main(String[] args) {

		new Result().show();
		
	}
	
}
