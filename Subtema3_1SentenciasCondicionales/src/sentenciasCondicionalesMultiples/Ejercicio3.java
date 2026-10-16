package sentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio3 {
	
	 public String ordenar(int num1, int num2, int num3) {
	        int aux;

	        if (num1 > num2) {
	            aux = num1;
	            num1 = num2;
	            num2 = aux;
	        }

	        if (num1 > num3) {
	            aux = num1;
	            num1 = num3;
	            num3 = aux;
	        }

	        if (num2 > num3) {
	            aux = num2;
	            num2 = num3;
	            num3 = aux;
	        }

	        return num1 + ", " + num2 + ", " + num3;
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

	        System.out.printf("Orden ascendente: %s%n", ordenar(num1, num2, num3));

	    }


	public static void main(String[] args) {

	}

}
