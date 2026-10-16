package anidacion;

import java.util.Scanner;

public class Ejercicio1 {
	
	@SuppressWarnings("resource")
	public void show() {
		int num;
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
		
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
