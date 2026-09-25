package tema10_Fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClassDateTimeFormatter2 {

	public void show() {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter textAndPatternMix = DateTimeFormatter.ofPattern("'Hoy es' EEEE dd-MMMM-yyyy 'a las' HH:mm:ss");
		System.out.println(now.format(textAndPatternMix));
		
	}

	public static void main(String[] args) {

		new ClassDateTimeFormatter2().show();

	}

}
