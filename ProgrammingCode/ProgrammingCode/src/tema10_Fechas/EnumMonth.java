package tema10_Fechas;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EnumMonth {

	public void show() {

		Month month1, month2, month3, month4;//Variables del tipo de enumeración Month
		month1 = Month.APRIL;//Se le asigna la instancia del mes de abril a través de la constante APRIL
		month2 = Month.of(2);//Se le asigna la instancia del mes de febrero a través del método of
		month3 = month1.plus(4);//Agosto
		month4 = month2.minus(3);//Noviembre
		System.out.printf("month1: %s, month2: %s, month3: %s, month4: %s",month1,month2,month3,month4);
		System.out.printf("\n%s tiene como mínimo %d días y como máximo %d días",month2,month2.minLength(),month2.maxLength());
		System.out.printf("\n%s tiene como mínimo %d días y como máximo %d días",month1,month1.minLength(),month1.maxLength());
		System.out.printf("\n%s tiene como mínimo %d días y como máximo %d días",month3,month3.minLength(),month3.maxLength());
		Locale l = Locale.of("es", "ES");//idioma español castellano, país España
		System.out.printf("\nTextStyle.FULL: %s\n", month1.getDisplayName(TextStyle.FULL, l));
		System.out.printf("TextStyle.NARROW: %s\n", month1.getDisplayName(TextStyle.NARROW, l));
		System.out.printf("TextStyle.SHORT: %s\n", month1.getDisplayName(TextStyle.SHORT, l));

	}

	public static void main(String[] args) {

		new EnumMonth().show();

	}

}
