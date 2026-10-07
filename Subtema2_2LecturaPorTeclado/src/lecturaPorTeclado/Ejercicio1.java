package lecturaPorTeclado;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// 1. Nombre
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();

		// 2. Apellidos
		System.out.print("Introduce tus apellidos: ");
		String apellidos = sc.nextLine();

		// 3. Edad
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		sc.nextLine();

		// 4. Dirección
		System.out.print("Introduce la calle: ");
		String calle = sc.nextLine();

		System.out.print("Introduce el número: ");
		int numero = sc.nextInt();

		System.out.print("Introduce el código postal: ");
		int codigoPostal = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce la provincia: ");
		String provincia = sc.nextLine();

		// 5. Estudiante
		System.out.print("¿Eres estudiante? (true/false): ");
		boolean estudiante = sc.nextBoolean();

		// 6. Altura
		System.out.print("Introduce tu altura en metros: ");
		double altura = sc.nextDouble();

		// Mostrar los datos
		System.out.println("\n--- DATOS INTRODUCIDOS ---");
		System.out.printf("Nombre: %s%n", nombre);
		System.out.printf("Apellidos: %s%n", apellidos);
		System.out.printf("Edad: %d años%n", edad);
		System.out.printf("Calle: %s%n", calle);
		System.out.printf("Número: %d%n", numero);
		System.out.printf("Código postal: %d%n", codigoPostal);
		System.out.printf("Provincia: %s%n", provincia);
		System.out.printf("Estudiante: %b%n", estudiante);
		System.out.printf("Altura: %.2f metros%n", altura);

	}
}