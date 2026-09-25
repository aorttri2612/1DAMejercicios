package tema3_1_SentenciasCondicionales;

import java.util.Scanner;

public class IfElseIf {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print("Introduce tu edad: ");
		age = keyboard.nextInt();

		if (age >= 18) {
			System.out.println("Eres mayor de edad");
		} else if (age >= 16 && age < 18) {
			System.out.println("Eres menor de edad pero tienes ciertos privilegios");
		} else if (age >= 14 && age < 16) {
			System.out.println("Eres menor de edad y además no tienes privilegios");
		} else {
			System.out.println("Eres menor de edad");
		}		
		
	}
	
	public static void main(String[] args) {

		new IfElseIf().show();

	}

}
