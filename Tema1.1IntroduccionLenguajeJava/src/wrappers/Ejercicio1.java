package wrappers;


public class Ejercicio1 {
	
	public void show() {
		 // 1. charValue() - Returns the char value of this Character object
        Character character = 'A';
        System.out.printf("1. charValue() = %c%n", character.charValue());

        // 2. isDigit(char ch) - Checks if the character is a digit
        char digit = '7';
        System.out.printf("2. isDigit('%c') = %b%n",
                digit, Character.isDigit(digit));

        // 3. isUpperCase(char ch) - Checks if the character is uppercase
        char letter = 'A';
        System.out.printf("3. isUpperCase('%c') = %b%n",
                letter, Character.isUpperCase(letter));

        // 4. toLowerCase(char ch) - Converts the character to lowercase
        char upper = 'B';
        System.out.printf("4. toLowerCase('%c') = %c%n",
                upper, Character.toLowerCase(upper));

        // 5. valueOf(char c) - Returns a Character object representing the char value
        char value = 'C';
        System.out.printf("5. valueOf('%c') = %c%n",
                value, Character.valueOf(value));
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
