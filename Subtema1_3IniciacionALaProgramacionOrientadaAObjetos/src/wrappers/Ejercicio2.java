package wrappers;

public class Ejercicio2 {
	
	public void show() {
		// 1. byteValue() - Returns the value of this Integer as a byte
        Integer number = 100;
        System.out.printf("1. byteValue() = %d%n", number.byteValue());

        // 2. intValue() - Returns the value of this Integer as an int
        System.out.printf("2. intValue() = %d%n", number.intValue());

        // 3. doubleValue() - Returns the value of this Integer as a double
        System.out.printf("3. doubleValue() = %.1f%n", number.doubleValue());

        // 4. toHexString(int i) - Converts an integer to its hexadecimal representation
        int hexadecimal = 255;
        System.out.printf("4. toHexString(%d) = %s%n",
                hexadecimal, Integer.toHexString(hexadecimal));

        // 5. parseInt(String s) - Converts a String into an int
        String text = "123";
        System.out.printf("5. parseInt(\"%s\") = %d%n",
                text, Integer.parseInt(text));

        // 6. valueOf(int i) - Returns an Integer object representing the specified int
        int value = 50;
        System.out.printf("6. valueOf(%d) = %d%n",
                value, Integer.valueOf(value));

        // 7. valueOf(String s) - Returns an Integer object representing the value of a String
        String numberText = "75";
        System.out.printf("7. valueOf(\"%s\") = %d%n",
                numberText, Integer.valueOf(numberText));
	}

	public static void main(String[] args) {
		new Ejercicio2().show();


	}

}
