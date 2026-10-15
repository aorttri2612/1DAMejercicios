package anidacion;

import java.util.Scanner;

public class Ejercicio1 {
	
	public void show() {
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un número entero: ");
         num = sc.nextInt();

        if (num > 0) {
            System.out.printf("El número es positivo.%n", num);
        } else if (num < 0) {
            System.out.printf("El número es negativo.%n", num);
        } else {
            System.out.printf("El número es cero.%n", num);
        }
		
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
