package tema3_1_SentenciasCondicionales;

import java.util.Scanner;

public class IfElse {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;

		System.out.print("Introduce tu nombre: ");
		name = keyboard.nextLine();
		System.out.print("Introduce tu edad: ");
		age = keyboard.nextInt();

		if (age >= 18) {
			System.out.printf("Bienvenido/a %s\n", name);
			System.out.println("Eres mayor de edad");
		} else {
			System.out.printf("Bienvenido/a %s\n", name);
			System.out.println("Eres menor de edad");
		}		
		
	}
	
	public static void main(String[] args) {

		new IfElse().show();

	}

}
