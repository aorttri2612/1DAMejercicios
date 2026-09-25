package tema9_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PossessiveQuantifiers {
	
	public void show() {
		
		Pattern patternGreedy = Pattern.compile("a+a");
		Pattern patternPossessive = Pattern.compile("a++a");
		Matcher matcherGreedy = patternGreedy.matcher("aaaa");
		Matcher matcherPossessive = patternPossessive.matcher("aaaa");

		while (matcherGreedy.find()) {
			System.out.printf("Greedy: coincidencia desde %d hasta %d\n", matcherGreedy.start(),
					matcherGreedy.end() - 1);
		}
		while (matcherPossessive.find()) {
			System.out.printf("Possessive: coincidencia desde %d hasta %d\n", matcherPossessive.start(),
					matcherPossessive.end() - 1);
		}
		
	}

	public static void main(String[] args) {

		new PossessiveQuantifiers().show();
		
	}

}
