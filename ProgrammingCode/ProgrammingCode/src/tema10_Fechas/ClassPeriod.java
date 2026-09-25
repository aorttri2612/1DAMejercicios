package tema10_Fechas;

import java.time.LocalDate;
import java.time.Period;

public class ClassPeriod {

	public void show() {

		Period period;
		LocalDate oldDate, currentDate;
		oldDate = LocalDate.of(1988, 9, 28);
		currentDate = LocalDate.now();
		period = Period.between(oldDate, currentDate);//Obtiene una instancia de Period a partir de dos fechas
		System.out.printf("Período entre %s y %s: son %d años, %d meses y %d días. ", oldDate, currentDate,
				period.getYears(), period.getMonths(), period.getDays());
		System.out.printf("En total son %d meses.", period.toTotalMonths());
		period = Period.ofWeeks(50);//Obtiene una instancia de Period de 50 semanas
		System.out.printf("\n\n50 semanas son %d días.", period.getDays());

	}

	public static void main(String[] args) {

		new ClassPeriod().show();

	}

}
