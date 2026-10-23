package bucleFor;

import java.util.Random;

public class Ejercicio1 {

	public void show() {
		int dice;
		Random random = new Random();
		for (int i = 1; i <= 20; i++) {
			dice = random.nextInt(1, 7);
			System.out.printf("lanzamiento %d de dado %d%n", i, dice);
		}

	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
