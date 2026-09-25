package tema10_Fechas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EnumChronoUnit {

	public void show() {

		LocalDateTime currentDateTime, concertDateTime;
		currentDateTime = LocalDateTime.of(2023, Month.JANUARY, 22, 17, 30);
		concertDateTime = LocalDateTime.of(2023, Month.AUGUST, 13, 21, 30);
		System.out.printf("Quedan para el concierto: %d meses o %d días o %d horas o %d minutos o %d segundos",
				ChronoUnit.MONTHS.between(currentDateTime, concertDateTime),
				ChronoUnit.DAYS.between(currentDateTime, concertDateTime),
				ChronoUnit.HOURS.between(currentDateTime, concertDateTime),
				ChronoUnit.MINUTES.between(currentDateTime, concertDateTime),
				ChronoUnit.SECONDS.between(currentDateTime, concertDateTime));

	}

	public static void main(String[] args) {

		new EnumChronoUnit().show();

	}

}
