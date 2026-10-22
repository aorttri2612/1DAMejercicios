package bucleWhile;

import java.util.Random;

public class Ejercicio1 {
	
	public void generateAleatoryNumber() {
		//VARIABLES LOCALES
		int num; 
		Random random = new Random();
		
		num = random.nextInt(1, 1001);
		while(num % 9 != 0) {
			 System.out.printf("%d%n", num);
			 num = random.nextInt(1, 1001);
		}
		
	}
	
	public void show() {
		generateAleatoryNumber();
		
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
