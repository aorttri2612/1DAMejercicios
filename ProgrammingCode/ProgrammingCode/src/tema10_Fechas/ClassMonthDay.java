package tema10_Fechas;

import java.time.Month;
import java.time.MonthDay;

public class ClassMonthDay {

	public void show() {

		MonthDay currentMonthDay, ofMonthDay, parseMonthDay;
		currentMonthDay = MonthDay.now();//Se obtiene el MonthDay actual
		System.out.printf("Este día es %s, es decir, día %d del mes %d", currentMonthDay,
				currentMonthDay.getDayOfMonth(), currentMonthDay.getMonthValue());
		ofMonthDay = MonthDay.of(Month.FEBRUARY, 29);//Obtiene una instancia MonthDay a partir de un mes y un día
		System.out.printf("\n\nEl día %s del mes %s%s es válido para el año 2004", ofMonthDay.getDayOfMonth(),
				ofMonthDay.getMonthValue(), ofMonthDay.isValidYear(2004) ? "" : " no");
		System.out.printf("\nEl día %s del mes %s%s es válido para el año 2010", ofMonthDay.getDayOfMonth(),
				ofMonthDay.getMonthValue(), ofMonthDay.isValidYear(2010) ? "" : " no");
		parseMonthDay = MonthDay.parse("--12-03");//Obtiene un MonthDay a partir de una cadena
		System.out.printf("\n\nMes-día obtenido a partir de una cadena: %s", parseMonthDay);

	}

	public static void main(String[] args) {

		new ClassMonthDay().show();

	}

}
