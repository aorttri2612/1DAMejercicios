package tema9_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoundaryMatchers2 {
	
	public void show() {
		
		String text = "Esto es un texto escrito en español";
		Pattern pattern;
		Matcher matcher;

		pattern = Pattern.compile("\\be", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(text);
		System.out.println("Las palabras que empiezan por e o por E se encuentran en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}

		pattern = Pattern.compile("\\Be");
		matcher = pattern.matcher(text);
		System.out.println("Las e que no son comienzos de palabra se encuentran en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}

		pattern = Pattern.compile("o\\b");
		matcher = pattern.matcher(text);
		System.out.println("Las o que son finales de palabras se encuentran en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}

		pattern = Pattern.compile("o\\B");
		matcher = pattern.matcher(text);
		System.out.println("Las o que no son finales de palabras se encuentran en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}
		/*
		 * Para realizar una búsqueda de palabras específicas 
		 * se coloca la palabra entre dos límites de palabra: 
		 */
		pattern = Pattern.compile("\\btexto\\b");
		matcher = pattern.matcher(text);
		System.out.println("La palabra texto se encuentra en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}
		
		pattern = Pattern.compile("^Lín.*", Pattern.MULTILINE);
		matcher = pattern.matcher("""
								  Línea 1
								  Línea 2
								  Línea 3
								  """);
		System.out.println("Las líneas que empiezan por Lín se encuentran en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}
		
		pattern = Pattern.compile(".*nea$", Pattern.MULTILINE);
		matcher = pattern.matcher("""
								  Primera Línea
								  Segunda Línea
								  Tercera Línea
								  """);
		System.out.println("Las líneas que finalizan por nea se encuentran en las siguientes posiciones:");
		while (matcher.find()) {
			System.out.println(matcher.start());
		}		
		
	}

	public static void main(String[] args) {

		new BoundaryMatchers2().show();
		
	}

}
