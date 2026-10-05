package wrappers;

public class Ejercicio3 {
	
	public void show() {
		 // 1. floatValue() - Returns the value of this Double as a float
        Double number = 12.75;
        System.out.printf("1. floatValue() = %.2f%n", number.floatValue());

        // 2. doubleValue() - Returns the value of this Double as a double
        System.out.printf("2. doubleValue() = %.2f%n", number.doubleValue());

        // 3. isInfinite() - Checks if this Double represents an infinite value
        Double infinite = Double.POSITIVE_INFINITY;
        System.out.printf("3. isInfinite() = %b%n", infinite.isInfinite());

        // 4. isInfinite(double v) - Checks if the specified double value is infinite
        double value = Double.NEGATIVE_INFINITY;
        System.out.printf("4. isInfinite(%.1f) = %b%n",
                value, Double.isInfinite(value));

        // 5. isNaN() - Checks if this Double represents Not-a-Number
        Double notANumber = Double.NaN;
        System.out.printf("5. isNaN() = %b%n", notANumber.isNaN());

        // 6. min(double a, double b) - Returns the smaller of two double values
        double num1 = 8.5;
        double num2 = 3.2;
        System.out.printf("6. min(%.1f, %.1f) = %.1f%n",
                num1, num2, Double.min(num1, num2));

        // 7. parseDouble(String s) - Converts a String into a double
        String text = "15.75";
        System.out.printf("7. parseDouble(\"%s\") = %.2f%n",
                text, Double.parseDouble(text));

        // 8. valueOf(double d) - Returns a Double object representing the specified double
        double valueDouble = 25.5;
        System.out.printf("8. valueOf(%.1f) = %.1f%n",
                valueDouble, Double.valueOf(valueDouble));

        // 9. valueOf(String s) - Returns a Double object representing the value of a String
        String numberText = "30.75";
        System.out.printf("9. valueOf(\"%s\") = %.2f%n",
                numberText, Double.valueOf(numberText));
	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
