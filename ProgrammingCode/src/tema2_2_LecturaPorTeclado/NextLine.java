package tema2_2_LecturaPorTeclado;

import java.util.Scanner;

public class NextLine {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		String str;
		int number;
		boolean b;

		// El nextLine toma el salto de línea dejado por cualquier otro next
		System.out.println("Introduzca un número entero: ");
		number = keyboard.nextInt();
		System.out.println(number);
		System.out.println("Introduzca una cadena: ");
		str = keyboard.nextLine();
		System.out.println(str);
		System.out.println("Introduzca un boolean: ");
		b = keyboard.nextBoolean();
		System.out.println(b);
		System.out.println("Introduzca una cadena: ");
		str = keyboard.nextLine();
		System.out.println(str);
		System.out.println("Introduzca una cadena con next: ");
		str = keyboard.next();
		System.out.println(str);
		System.out.println("Introduzca una cadena con nextLine: ");
		str = keyboard.nextLine();
		System.out.println(str);
		// Solución: poner un nextLine que coja el salto de línea.A esto se le conoce como limpiar el buffer.
		System.out.println("Vamos a solucionar el problema.\nIntroduzca un número entero: ");
		number = keyboard.nextInt();
		System.out.println(number);
		System.out.println("Introduzca una cadena: ");
		keyboard.nextLine(); // Limpieza del buffer
		str = keyboard.nextLine();
		System.out.println(str);		
		
	}
	
	public static void main(String[] args) {

		new NextLine().show();

	}

}
