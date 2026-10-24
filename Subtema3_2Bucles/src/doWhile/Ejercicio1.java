package doWhile;

import java.util.Random;

public class Ejercicio1 {

	    public void generateAleatoryNumber() {
	    	Random random = new Random();
			
			int num;
			
			final int DIVISIBLE = 9;
			final int MAX = 1000;
			
			do {
				num = random.nextInt(1, MAX + 1);
				System.out.println(num);
			} while(num % DIVISIBLE != 0);
		}

		public void show() {
			generateAleatoryNumber();
			
		}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
