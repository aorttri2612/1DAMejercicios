package tema9_ExpresionesRegulares;

import java.util.regex.Pattern;

public class PatternClass {
	
	public void show() {
		
		Pattern pattern = Pattern.compile("\\p{Upper}\\p{Lower}");
		System.out.println(pattern.pattern());//\p{Upper}\p{Lower}

		System.out.println(Pattern.matches("\\p{Upper}\\p{Lower}", "Ho"));//true
		System.out.println(Pattern.matches("\\p{Upper}\\p{Lower}", "ho"));//false
		
	}

	public static void main(String[] args) {

		new PatternClass().show();

	}

}
