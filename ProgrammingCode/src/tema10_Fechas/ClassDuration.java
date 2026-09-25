package tema10_Fechas;

import java.time.Duration;

public class ClassDuration {

	public void show() {

		Duration duration;
		duration = Duration.ofMinutes(10);
		System.out.printf("Minutos: %d", duration.toMinutes());
		System.out.printf("\nSegundos: %d", duration.toSeconds());
		System.out.printf("\nNanosegundos: %d", duration.toNanos());

	}

	public static void main(String[] args) {

		new ClassDuration().show();

	}

}
