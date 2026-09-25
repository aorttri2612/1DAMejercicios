package tema5_POO.invariante;

import java.util.Scanner;

public class Invariance3 {

	@SuppressWarnings("resource")
	public void show() {

		Vehicle vehicle;
		String colour;
		Scanner keyboard = new Scanner(System.in);
		
		try {
			System.out.println("Introduzca un color para el vehículo: ");
			colour = keyboard.nextLine();
			vehicle = new Vehicle(4, colour);
			System.out.println(vehicle);
			System.out.println("Introduzca el nuevo color del vehículo: ");
			colour = keyboard.nextLine();
			vehicle.setColour(colour);
			System.out.println(vehicle);
		} catch (IllegalArgumentException e) {
			System.err.println("El color del vehículo no puede estar vacío");
		}

	}

	public static void main(String[] args) {

		new Invariance3().show();

	}

}
