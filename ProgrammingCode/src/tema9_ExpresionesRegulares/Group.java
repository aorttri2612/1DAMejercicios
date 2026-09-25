package tema9_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
	
	public void show() {
		
		//Como veremos en el siguiente apartado,el + es 1 ó más veces
		Pattern pattern = Pattern.compile("((\\d+)\\+(\\d+))=(\\d+)");
		Matcher matcher = pattern.matcher("23+56=79;15+13=28;30+60=90");

		while (matcher.find()) {
			System.out.println(matcher.group(0));
			System.out.printf("Sumandos: %s\n", matcher.group(1));
			System.out.printf("Sumando 1: %s\n", matcher.group(2));
			System.out.printf("Sumando 2: %s\n", matcher.group(3));
			System.out.printf("Resultado: %s\n\n", matcher.group(4));

		}
		
	}

	public static void main(String[] args) {

		new Group().show();

	}

}