package tema10_Fechas;

import java.time.Year;

public class ClassYear {

	public void show() {

		Year currentYear, ofYear, parseYear;
		currentYear = Year.now();//Obtiene el año actual
		System.out.printf("Este año es %s y %s es bisiesto\n", currentYear, currentYear.isLeap() ? "sí" : "no");
		ofYear = Year.of(2012);//Obtiene una instancia Year a partir de un año
		System.out.printf("\nEl año %s es %s al año actual", ofYear,
				ofYear.isBefore(currentYear) ? "anterior" : "posterior");
		parseYear = Year.parse("2021");//Obtiene un Year a partir de una cadena
		System.out.printf("\n\nAño obtenido a partir de una cadena: %s", parseYear);

	}

	public static void main(String[] args) {

		new ClassYear().show();

	}

}
