package doWhile;

import java.util.Random;

public class Ejercicio2 {
	

	    public void generateAleatoryNumberWith7Attempts() {
	    	int num = 0;
	 	    int attempts = 0;
	 	    Random random = new Random();

	        do {
	            num = random.nextInt(100) + 1;
	            attempts++;
	        } while (num % 9 != 0 && attempts < 7);

	        if (num % 9 == 0) {
	            System.out.printf("Multiple of 9 found: %d%n", num);
	        } else {
	            System.out.printf("No multiple of 9 found in 7 attempts.%n");
	        }
	    }
	    public void show() {
	    	generateAleatoryNumberWith7Attempts();
	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
