package string;

public class Ejercicio1 {
	public void show () {
		   String texto = "Hello World";

	        // 1. char charAt(int index) - Returns the character at the specified index
	        System.out.printf("1. charAt(1) = %c%n", texto.charAt(1));

	        // 2. int length() - Returns the number of characters in the string
	        System.out.printf("2. length() = %d%n", texto.length());

	        // 3. String concat(String str) - Concatenates the specified string to the end
	        System.out.printf("3. concat() = %s%n", texto.concat("!"));

	        // 4. boolean endsWith(String suffix) - Checks if the string ends with the specified suffix
	        System.out.printf("4. endsWith(\"World\") = %b%n", texto.endsWith("World"));

	        // 5. int indexOf(int ch) - Returns the index of the first occurrence of a character
	        System.out.printf("5. indexOf('o') = %d%n", texto.indexOf('o'));

	        // 6. int indexOf(int ch, int fromIndex) - Returns the index of the first character occurrence from a specified index
	        System.out.printf("6. indexOf('o', 5) = %d%n", texto.indexOf('o', 5));

	        // 7. int indexOf(String str) - Returns the index of the first occurrence of a substring
	        System.out.printf("7. indexOf(\"World\") = %d%n", texto.indexOf("World"));

	        // 8. int indexOf(String str, int fromIndex) - Returns the index of a substring starting from a specified index
	        System.out.printf("8. indexOf(\"o\", 5) = %d%n", texto.indexOf("o", 5));

	        // 9. boolean isEmpty() - Checks if the string has no characters
	        String vacio = "";
	        System.out.printf("9. isEmpty() = %b%n", vacio.isEmpty());

	        // 10. int lastIndexOf(int ch) - Returns the index of the last occurrence of a character
	        System.out.printf("10. lastIndexOf('o') = %d%n", texto.lastIndexOf('o'));

	        // 11. int lastIndexOf(int ch, int fromIndex) - Returns the last occurrence before or at the specified index
	        System.out.printf("11. lastIndexOf('o', 6) = %d%n", texto.lastIndexOf('o', 6));

	        // 12. int lastIndexOf(String str) - Returns the index of the last occurrence of a substring
	        System.out.printf("12. lastIndexOf(\"o\") = %d%n", texto.lastIndexOf("o"));

	        // 13. int lastIndexOf(String str, int fromIndex) - Returns the last occurrence before or at the specified index
	        System.out.printf("13. lastIndexOf(\"o\", 6) = %d%n", texto.lastIndexOf("o", 6));

	        // 14. String replace(char oldChar, char newChar) - Replaces all occurrences of a character
	        System.out.printf("14. replace('o', 'a') = %s%n", texto.replace('o', 'a'));

	        // 15. String toUpperCase() - Converts all characters to uppercase
	        System.out.printf("15. toUpperCase() = %s%n", texto.toUpperCase());

	        // 16. String trim() - Removes leading and trailing whitespace
	        String espacios = "   Hello World   ";
	        System.out.printf("16. trim() = %s%n", espacios.trim());

	        // 17. static String valueOf(double d) - Converts a double value into a String
	        double numero = 25.75;
	        System.out.printf("17. valueOf() = %s%n", String.valueOf(numero));
	}
	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
