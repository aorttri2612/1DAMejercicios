package sentenciasCondicionalesDobles;

import java.util.Scanner;

public class Ejercicio3 {
	
	public void show() {
		        @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);

		        System.out.printf("Introduce la distancia de ida en Km: ");
		        double distance = sc.nextDouble();

		        System.out.printf("Introduce los días de estancia: ");
		        int days = sc.nextInt();

		        double totaldistance = distance * 2;
		        double price = totaldistance * 0.35;

		        if (totaldistance > 1000 && days > 7) {
		            price = price * 0.70;
		        }

		        System.out.printf("Distancia total: %.2f Km%n", totaldistance);
		        System.out.printf("Precio del billete: %.2f €%n", price);

		    }

	public static void main(String[] args) {
		
		new Ejercicio3().show();

	}

}
