package tema10_Fechas;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class EnumDayOfWeek {

	public void show() {

		DayOfWeek day1, day2, day3, day4;//Variables del tipo de enumeración DayOfWeek
		day1 = DayOfWeek.MONDAY;//Se le asigna la instancia del lunes a través de la constante MONDAY
		day2 = DayOfWeek.of(1);//Se le asigna la instancia del lunes a través del método of
		day3 = day1.plus(4);//Viernes
		day4 = day2.minus(2);//Sábado
		System.out.printf("day1: %s, day2: %s, day3: %s, day4: %s",day1,day2,day3,day4);
		Locale l = Locale.of("es", "ES");//idioma español castellano, país España
		System.out.printf("\nTextStyle.FULL: %s\n", day1.getDisplayName(TextStyle.FULL, l));
		System.out.printf("TextStyle.NARROW: %s\n", day1.getDisplayName(TextStyle.NARROW, l));
		System.out.printf("TextStyle.SHORT: %s\n", day1.getDisplayName(TextStyle.SHORT, l));

	}

	public static void main(String[] args) {

		new EnumDayOfWeek().show();

	}

}
