package tema10_Fechas;

import java.time.LocalTime;

public class ClassLocalTime {

	public void show() {

		LocalTime currentTime, meetingTime, parseTime;
		currentTime = LocalTime.now();//Se obtiene la hora actual
		System.out.printf("Hora actual: %s", currentTime);
		System.out.printf("\nHora: %s Minutos: %s Segundos: %s Nanosegundos: %s", currentTime.getHour(),
				currentTime.getMinute(), currentTime.getSecond(), currentTime.getNano());
		meetingTime = LocalTime.of(10, 15);//Obtiene una instancia de LocalTime indicando hora y minutos
		System.out.printf("\n\nHora de la reunión: %s", meetingTime);
		parseTime = LocalTime.parse("11:45:30");//Obtiene un LocalTime a partir de una cadena
		System.out.printf("\n\nHora obtenida a partir de una cadena: %s", parseTime);

	}

	public static void main(String[] args) {

		new ClassLocalTime().show();

	}

}
