package tema3_1_SentenciasCondicionales;

import java.util.Scanner;

public class Switch2 {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in);
		int month, year, numDays = 0;

		System.out.print("Introduce un número del 1 al 12 correspondiente a un mes: ");
		month = keyboard.nextInt();
		System.out.print("Introduce un año: ");
		year = keyboard.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2://Se calcula si es un año bisiesto
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				numDays = 29;
			} else {
				numDays = 28;
			}
			break;
		default:
			System.out.println("Mes inválido");
			break;
		}
		if (month >= 1 && month <= 12) {
			System.out.printf("Número de días del mes %d del año %d: %d", month, year, numDays);
		}		
		
	}

	public static void main(String[] args) {

		new Switch2().show();

	}

}
