package tema10_Fechas;

import java.time.LocalDate;

public class ClassLocalDate {

	public void show() {

		LocalDate currentDate, concertDate, parseDate;
		currentDate = LocalDate.now();//Se obtiene la fecha actual
		System.out.printf("Fecha actual: %s", currentDate);
		System.out.printf(", es decir, día %s del mes %s del año %s.", currentDate.getDayOfMonth(),
				currentDate.getMonthValue(), currentDate.getYear());
		concertDate = LocalDate.of(2022, 8, 13);//Obtiene una instancia de LocalDate a partir de un año, mes y día
		System.out.printf("\n\nEl concierto es el %s.", concertDate);
		System.out.println(" Las entradas se podrán comprar como máximo hasta");
		System.out.printf("5 días antes, es decir, hasta el %s.", concertDate.minusDays(5));
		parseDate = LocalDate.parse("2022-02-22");//Obtiene un LocalDate a partir de una cadena
		System.out.printf("\n\nFecha obtenida a partir de una cadena: %s", parseDate);

	}

	public static void main(String[] args) {

		new ClassLocalDate().show();

	}

}
