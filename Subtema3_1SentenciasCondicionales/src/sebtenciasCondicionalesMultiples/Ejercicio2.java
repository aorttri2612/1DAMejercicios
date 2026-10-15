package sebtenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio2 {
	
	  public String comprobarIguales(int num1, int num2, int num3) {

	        if (num1 == num2 && num2 == num3) {
	            return "Hay tres números iguales a " + num1;
	        } else if (num1 == num2) {
	            return "Hay dos números iguales a " + num1;
	        } else if (num1 == num3) {
	            return "Hay dos números iguales a " + num1;
	        } else if (num2 == num3) {
	            return "Hay dos números iguales a " + num2;
	        } else {
	            return "No hay números iguales";
	        }
	    }

	    public void show() {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

	        System.out.printf("Introduce el primer número: ");
	        int num1 = sc.nextInt();

	        System.out.printf("Introduce el segundo número: ");
	        int num2 = sc.nextInt();

	        System.out.printf("Introduce el tercer número: ");
	        int num3 = sc.nextInt();

	        System.out.printf("%s%n", comprobarIguales(num1, num2, num3));
	    }

	    public static void main(String[] args) {
	        new Ejercicio2().show();
	    }
	}

