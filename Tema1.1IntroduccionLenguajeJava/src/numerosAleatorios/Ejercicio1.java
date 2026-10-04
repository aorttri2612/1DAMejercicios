package numerosAleatorios;

import java.util.Random;

public class Ejercicio1 {
	
	public void show() {
		 
		 boolean coin;
		 int dice;
		 int number;
		 double decimal;
		 int day;
		 int month;
		 int weekDay;
		 int yearMonth;
		 
		 Random random = new Random();

		 // 1. Generate a random boolean for a coin
		 coin = random.nextBoolean();
		 System.out.printf("1. Coin = %b%n", coin);

		 // 2. Generate a random number between 1 and 6
		 dice = random.nextInt(6) + 1;
		 System.out.printf("2. Dice = %d%n", dice);

		 // 3. Generate a random number between 34 and 68
		 number = random.nextInt(35) + 34;
		 System.out.printf("3. Number = %d%n", number);

		 // 4. Generate a random decimal number between 0.0 and 1.0
		 decimal = random.nextDouble();
		 System.out.printf("4. Decimal = %.4f%n", decimal);

		 // 5. Generate a random day of the week from 1 to 7
		 day = random.nextInt(7) + 1;
		 System.out.printf("5. Day of the week = %d%n", day);

		 // 6. Generate a random month from 1 to 12
		 month = random.nextInt(12) + 1;
		 System.out.printf("6. Month = %d%n", month);

		 // 7. Generate a random day of the week from 1 to 7
		 weekDay = random.nextInt(7) + 1;
		 System.out.printf("7. Day of the week = %d%n", weekDay);

		 // 8. Generate a random month from 1 to 12
		 yearMonth = random.nextInt(12) + 1;
		 System.out.printf("8. Month of the year = %d%n", yearMonth);
    }
	

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
