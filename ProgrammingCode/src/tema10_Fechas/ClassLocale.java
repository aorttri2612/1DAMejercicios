package tema10_Fechas;

import java.util.Locale;

public class ClassLocale {

	public void show() {

		Locale l = Locale.getDefault();
		System.out.println(l.toString());

	}

	public static void main(String[] args) {

		new ClassLocale().show();

	}

}
