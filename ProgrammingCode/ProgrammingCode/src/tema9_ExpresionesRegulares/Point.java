package tema9_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {
	
	public void show() {
		
		Pattern pattern = Pattern.compile(".", Pattern.DOTALL);
		Matcher matcher = pattern.matcher("\n");
		System.out.println(matcher.matches());//true

		System.out.println("\n".matches("."));//false
		
	}

	public static void main(String[] args) {

		new Point().show();

	}

}
