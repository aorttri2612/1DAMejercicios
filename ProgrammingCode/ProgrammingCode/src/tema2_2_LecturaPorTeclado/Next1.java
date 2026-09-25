package tema2_2_LecturaPorTeclado;

import java.util.Scanner;

public class Next1 {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		String string1, string2, string3;

		System.out.println("Introduzca 3 palabras separadas por espacio: ");
		string1 = keyboard.next();
		string2 = keyboard.next();
		string3 = keyboard.next();
		System.out.println("Primera palabra: " + string1);
		System.out.println("Segunda palabra: " + string2);
		System.out.println("Tercera palabra: " + string3);
		
	}

	
	public static void main(String[] args) {

		new Next1().show();
		
	}

}
