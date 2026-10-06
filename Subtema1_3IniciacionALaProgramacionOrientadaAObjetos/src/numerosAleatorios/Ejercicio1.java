package numerosAleatorios;

import java.util.Random;

public class Ejercicio1 {
	
	public void show() {
		 
		 int dice;
		 int number;
		 double decimal;
		 int day;
		 int month;
		 int weekDay;
		 int yearMonth;
		 
		 Random random = new Random();

		 // 1. Generate a random boolean for a coin
		 System.out.println(random.nextBoolean()? "cara": "cruz");
		 

		 // 2. Generate a random number between 1 and 6
		 dice = random.nextInt(1,6);
		 System.out.printf("2. Dice = %d%n", dice);

		 // 3. Generate a random number between 34 and 68
		 number = random.nextInt(34, 69); //default int nextint(int origin, int bound); easier way to do it
		 System.out.printf("3. Number = %d%n", number);

		 // 4. Generate a random decimal number between 0.0 and 1.0
		 decimal = random.nextDouble();
		 System.out.printf("4. Decimal = %.4f%n", decimal);

		 // 5. Generate a random day of the week from 1 to 7
		 day = random.nextInt(7) + 1;
		 // random.nextInt(1, 8); the other way to do it with the method written in comments before.
		 System.out.printf("5. Day of the week = %d%n", day);

		 // 6. Generate a random month from 1 to 12
		 month = random.nextInt(12) + 1;
		 System.out.printf("6. Month = %d%n", month);

		 // 7. Generate a random day of the week from 1 to 7
		 int day1 = random.nextInt(7)+1;
			String day2 = day1==1? "Lunes": day1==2? "Martes": day1==3? "Miercoles": day1==4? "Jueves": day1==5? "Viernes": day1==6? "Sabado": "Domingo";
			System.out.println(day2 + (day1<6? ", entre semana": ", fin de semana")); //day1<6? ", entre semana": ", fin de semana";

		 // 8. Generate a random month from 1 to 12
		 yearMonth = random.nextInt(12) + 1;
		 String month2 = yearMonth==1? "Enero": yearMonth==2? "Febrero": yearMonth==3? "Marzo": yearMonth==4? "Abril": yearMonth==5? "Mayo": yearMonth==6? "Junio": yearMonth == 7? "Julio": yearMonth == 8? "Agosto": yearMonth == 9? "Septiembre": yearMonth == 10? "Octubre": yearMonth == 11? "Noviembre": "Diciembre";
			System.out.println(month2 + (yearMonth<7 || yearMonth>8? ", no es verano": ", es verano")); //month1<7 || month1>8? ", no es verano": ", es verano";
    }
	

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
