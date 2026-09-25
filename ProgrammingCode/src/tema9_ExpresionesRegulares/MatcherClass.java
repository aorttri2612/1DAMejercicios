package tema9_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
	
	public void show() {
	
		int count;
		//Con Pattern.CASE_INSENSITIVE, no se distingue entre mayúsculas y minúsculas
		Pattern pattern = Pattern.compile("es", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Estoy en España");
		System.out.println(matcher.matches());//false	
		System.out.println(matcher.lookingAt());//true

		matcher.reset("Esto es un escrito en español");
		count = 0;
		while (matcher.find()) {
			count++;
			System.out.printf("Coincidencia número %d: empieza en %d y termina en %d\n", count, matcher.start(),
					matcher.end() - 1);
		}
		
	}

	public static void main(String[] args) {

		new MatcherClass().show();

	}

}
