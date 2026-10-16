package doWhile;

import java.util.Random;

public class Ejercicio1 {
	  int num;
	    Random random = new Random();

	    public void generateAleatoryNumber() {

	        num = random.nextInt(1000) + 1;

	        while (num % 9 != 0) {
	            System.out.printf("%d%n", num);
	            num = random.nextInt(1000) + 1;
	        }

	        System.out.printf("%d%n", num);
	    }

		public void show() {
			generateAleatoryNumber();
			
		}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
