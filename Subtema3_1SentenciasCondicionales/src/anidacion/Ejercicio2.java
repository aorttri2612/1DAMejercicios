package anidacion;

import java.util.Scanner;

public class Ejercicio2 {
	double temperatura;
	
	 public String comprobarTemperatura(double temperatura) {

			    int tipo;

			    if (temperatura < 0) {
			        tipo = 1;
			    } else if (temperatura < 15) {
			        tipo = 2;
			    } else if (temperatura < 25) {
			        tipo = 3;
			    } else if (temperatura < 35) {
			        tipo = 4;
			    } else {
			        tipo = 5;
			    }

			    switch (tipo) {
			        case 1:
			            return "Hace mucho frío";
			        case 2:
			            return "Hace frío";
			        case 3:
			            return "Temperatura agradable";
			        case 4:
			            return "Hace calor";
			        default:
			            return "Hace mucho calor";
			    }
	 }

	    public void show() {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

	        System.out.printf("Introduce la temperatura: ");
	         temperatura = sc.nextDouble();

	        System.out.printf("%s%n", comprobarTemperatura(temperatura));

	        
	    }
	public static void main(String[] args) {
		
		new Ejercicio2().show();

	}

}
