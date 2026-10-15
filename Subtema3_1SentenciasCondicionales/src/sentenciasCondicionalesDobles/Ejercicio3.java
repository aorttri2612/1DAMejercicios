package sentenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio3 {
	
	public void show() {
		        @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);

		        System.out.printf("Introduce la distancia de ida en Km: ");
		        double distancia = sc.nextDouble();

		        System.out.printf("Introduce los días de estancia: ");
		        int dias = sc.nextInt();

		        double distanciaTotal = distancia * 2;
		        double precio = distanciaTotal * 0.35;

		        if (distanciaTotal > 1000 && dias > 7) {
		            precio = precio * 0.70;
		        }

		        System.out.printf("Distancia total: %.2f Km%n", distanciaTotal);
		        System.out.printf("Precio del billete: %.2f €%n", precio);

		    }

	public static void main(String[] args) {
		
		new Ejercicio3().show();

	}

}
