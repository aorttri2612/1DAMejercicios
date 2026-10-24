package anidacion;

import java.util.Scanner;

public class Ejercicio2 {
	double temperature;
	
	 public String SawTemperature(double temp) {

			    int type;

			    if (temp < 0) {
			        type = 1;
			    } else if (temp < 15) {
			        type = 2;
			    } else if (temp < 25) {
			        type = 3;
			    } else if (temp < 35) {
			        type = 4;
			    } else {
			        type = 5;
			    }

			    switch (type) {
			        case 1:
			            return "freezing";
			        case 2:
			            return "cold";
			        case 3:
			            return "good temperature";
			        case 4:
			            return "hot";
			        default:
			            return "boiling hot";
			    }
	 }

	    public void show() {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

	        System.out.printf("Enter the temperature: ");
	         temperature = sc.nextDouble();

	        System.out.printf("%s%n", SawTemperature(temperature));

	        
	    }
	public static void main(String[] args) {
		
		new Ejercicio2().show();

	}

}
