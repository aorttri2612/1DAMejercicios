package tema10_Fechas;

import java.time.Month;
import java.time.YearMonth;

public class ClassYearMonth {

	public void show() {

		YearMonth currentYearMonth, ofYearMonth, parseYearMonth;
		currentYearMonth = YearMonth.now();//Se obtiene el YearMonth actual
		System.out.printf("Este año-mes es %s y tiene %d días", currentYearMonth, currentYearMonth.lengthOfMonth());
		ofYearMonth = YearMonth.of(2004, Month.FEBRUARY);//Obtiene una instancia YearMonth a partir de un año y un mes
		System.out.printf("\n\nEl año-mes %s tuvo %d días", ofYearMonth, ofYearMonth.lengthOfMonth());
		ofYearMonth = YearMonth.of(2010, Month.FEBRUARY);
		System.out.printf("\nEl año-mes %s tuvo %d días", ofYearMonth, ofYearMonth.lengthOfMonth());
		ofYearMonth = YearMonth.of(2000, Month.FEBRUARY);
		System.out.printf("\nEl año-mes %s tuvo %d días", ofYearMonth, ofYearMonth.lengthOfMonth());
		parseYearMonth = YearMonth.parse("2022-12");//Obtiene un YearMonth a partir de una cadena
		System.out.printf("\n\nAño-mes obtenido a partir de una cadena: %s", parseYearMonth);
	}

	public static void main(String[] args) {

		new ClassYearMonth().show();

	}

}
