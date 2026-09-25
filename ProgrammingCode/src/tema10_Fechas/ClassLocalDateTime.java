package tema10_Fechas;

import java.time.LocalDateTime;

public class ClassLocalDateTime {

	public void show() {

		LocalDateTime currentDateTime, meetingDateTime, parseDateTime;
		currentDateTime = LocalDateTime.now();//Se obtiene la fecha y hora actual
		System.out.printf("Fecha y hora actual: %s", currentDateTime);
		System.out.printf("\nDía del año: %s", currentDateTime.getDayOfYear());
		System.out.printf("\nDía de la semana: %s", currentDateTime.getDayOfWeek());
		System.out.printf("\nHora: %s", currentDateTime.getHour());
		System.out.printf("\nNanosegundos: %s", currentDateTime.getNano());
		meetingDateTime = LocalDateTime.of(2022, 11, 16, 9, 30, 45);//Obtiene una instancia de LocalDateTime a partir de un año,mes,día,hora,minutos y segundos
		System.out.printf("\n\nLa reunión es %s", meetingDateTime);
		System.out.printf("\nFecha de la reunión: %s", meetingDateTime.toLocalDate());
		System.out.printf("\nHora de la reunión: %s", meetingDateTime.toLocalTime());
		parseDateTime = LocalDateTime.parse("2022-12-03T10:15:30");//Obtiene un LocalDateTime a partir de una cadena
		System.out.printf("\n\nFecha y hora obtenida a partir de una cadena: %s", parseDateTime);

	}

	public static void main(String[] args) {

		new ClassLocalDateTime().show();

	}

}
