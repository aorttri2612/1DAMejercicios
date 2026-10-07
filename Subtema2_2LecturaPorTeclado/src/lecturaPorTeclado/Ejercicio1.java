package lecturaPorTeclado;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// 1. Nombre
		System.out.print("Introduce tu nombre: ");
		String name = sc.nextLine();

		// 2. Apellidos
		System.out.print("Introduce tus apellidos: ");
		String surname = sc.nextLine();

		// 3. Edad
		System.out.print("Introduce tu edad: ");
		int age = sc.nextInt();
		sc.nextLine();

		// 4. Dirección
		System.out.print("Introduce la calle: ");
		String street = sc.nextLine();

		System.out.print("Introduce el número: ");
		int num = sc.nextInt();

		System.out.print("Introduce el código postal: ");
		int PostalCode = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce la provincia: ");
		String province = sc.nextLine();

		// 5. Estudiante
		System.out.print("¿Eres estudiante? (true/false): ");
		boolean student = sc.nextBoolean();

		// 6. Altura
		System.out.print("Introduce tu altura en metros: ");
		double height = sc.nextDouble();

		// Mostrar los datos
		System.out.println("\n--- DATOS INTRODUCIDOS ---");
		System.out.printf("Nombre: %s%n", name);
		System.out.printf("Apellidos: %s%n", surname);
		System.out.printf("Edad: %d años%n", age);
		System.out.printf("Calle: %s%n", street);
		System.out.printf("Número: %d%n", num);
		System.out.printf("Código postal: %d%n", PostalCode);
		System.out.printf("Provincia: %s%n", province);
		System.out.printf("Estudiante: %b%n", student);
		System.out.printf("Altura: %.2f metros%n", height);

	}
}