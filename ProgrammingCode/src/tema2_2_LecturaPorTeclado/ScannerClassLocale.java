package tema2_2_LecturaPorTeclado;

import java.util.Locale;
import java.util.Scanner;

public class ScannerClassLocale {
	
	@SuppressWarnings("resource")
	public void show() {
		
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
		float f;
		// Debido al useLocale(Locale.US), el símbolo separador de decimales será el .
		f = keyboard.nextFloat();
		System.out.println(f);		
		
	}
	
	public static void main(String[] args) {

		new ScannerClassLocale().show();
		
	}

}
