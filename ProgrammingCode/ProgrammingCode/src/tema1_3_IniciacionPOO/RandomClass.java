package tema1_3_IniciacionPOO;

import java.util.Random;

public class RandomClass {
	
	public void show() {
		
		Random random = new Random(); // Sin semilla
		Random randomSeed = new Random(3816);// Con semilla. Siempre se generan los mismos números

		System.out.println(random.nextBoolean());
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt(6) + 5);// Genera un número aleatorio entre 5 y 10

		System.out.println(randomSeed.nextBoolean());
		System.out.println(randomSeed.nextInt());
		System.out.println(randomSeed.nextLong());
		System.out.println(randomSeed.nextFloat());
		System.out.println(randomSeed.nextDouble());
		System.out.println(randomSeed.nextInt(6) + 5);		
		
	}

	public static void main(String[] args) {

		new RandomClass().show();
		
	}

}
