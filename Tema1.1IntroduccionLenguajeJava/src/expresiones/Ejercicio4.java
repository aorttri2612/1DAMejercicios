package expresiones;


public class Ejercicio4 {
	
	public void show() {
		
		 // Variable declarations
		  boolean z;
	        boolean condition = false;

	        int a = 5;
	        int b = 10;
	        int x;
	        int i;
	        int j = 5;
	        int precio = 100;

	        char c = 'A';
	        char d;

	        double xd;


	     // 1. VALID
	        z = 2 < 1;
	        System.out.printf("1. z = %b%n", z);
	        // z is boolean because a comparison returns true or false.


	        // 2. VALID
	        a = a + 1;
	        System.out.printf("2. a = %d%n", a);
	        // a increases by 1.


	        // 3. NOT VALID
	        // 'x' = 'y';
	        // A literal cannot be assigned a value.
	        // The left side of = must be a variable.


	        // 4. VALID
	        x = 'y';
	        System.out.printf("4. x = %c (Código int: %d)%n", (char) x, x);
	        // 'y' is a char, but it can be automatically converted to int.
	        // The Unicode value of 'y' is 121. Se fuerza (char) para imprimir 'y' y no solo 121.


	        // 5. VALID
	        a = b;
	        System.out.printf("5. a = %d%n", a);
	        // Both variables are int, so the value of b is assigned to a.


	        // 6. VALID, but integer division
	        precio = precio - precio * (30 / 100);
	        System.out.printf("6. precio = %d%n", precio);
	        // 30 / 100 is integer division, so the result is 0.
	        // Therefore, the price does not decrease.


	        // 7. VALID
	        a = a < b ? 5 + 1 : 7 - 3 * 2;
	        System.out.printf("7. a = %d%n", a);
	        // If a < b, a receives 6.
	        // Otherwise, a receives 1.


	        // 8. NOT VALID AT EXECUTION
	        // a = b / 0;
	        // Division by zero with integers causes an ArithmeticException.
	        // It would stop the program, so it is commented out.


	        // 9. VALID
	        i = ++j;
	        System.out.printf("9. i = %d, j = %d%n", i, j);
	        // j is increased first, then its new value is assigned to i.


	        // 10. VALID
	        i = j++;
	        System.out.printf("10. i = %d, j = %d%n", i, j);
	        // The current value of j is assigned to i first.
	        // Then j is increased by 1.


	        // 11. NOT VALID
	        // c = ''';
	        // A single quote must be escaped when used as a char.
	        // Correct: c = '\'';


	        // 12. VALID
	        c = '”';
	        System.out.printf("12. c = %c%n", c);
	        // c contains the character ”.


	        // 13. VALID
	        c = 'c';
	        System.out.printf("13. c = %c%n", c);
	        // c contains the character 'c'.


	        // 14. NOT VALID
	        // s = ”'”;
	        // These are typographic quotation marks and are not valid Java syntax.
	        // Also, s has not been declared.


	        // 15. NOT VALID
	        // s = ”””;
	        // These quotation marks are not valid Java syntax.


	        // 16. VALID
	        c = '\u0041';
	        System.out.printf("16. c = %c%n", c);
	        // Unicode 0041 corresponds to the character A.


	        // 17. VALID
	        c = 65;
	        System.out.printf("17. c = %c%n", c);
	        // 65 is the Unicode value of A ('A'). %c imprime la letra en lugar del número.


	        // 18. VALID
	        xd = (a > b ? 5.4 * 3 : 65.1 / 8);
	        System.out.printf("18. xd = %.4f%n", xd);
	        // If a > b, xd = 16.2.
	        // Otherwise, xd = 8.1375.


	        // 19. NOT VALID
	        // a == a > b ? 3 + 6 : 9 - 4;
	        // == is a comparison operator, not an assignment operator.
	        // There is no variable receiving the result.


	        // 20. VALID
	        d = (char) (condition ? c++ : --c);
	        System.out.printf("20. d = %c, c (tras incremento/decrecimiento) = %c%n", d, c);
	        // condition must be boolean.
	        // If condition is true, c++ is executed.
	        // If condition is false, --c is executed.
	        // A cast is needed because the expression is promoted to int.
	        
	        System.out.println("Ejercicios no válidos: 3, 8, 11, 14, 15, 19");
	        
	        //CORRECTIONS
	        
	     // 3.The variable must be on the left side of the assignment operator '='
	        x = 'y'; // Assigns the char 'y' to the variable x
	        System.out.printf("3 (Corrected). x = %c%n", (char) x);

	        // 8. Avoid division by zero, assigning non-zero divisor or validating
	        a = (b != 0) ? b / 2 : 0; // Avoids division by zero to prevent ArithmeticException
	        System.out.printf("8 (Corrected). a = %d%n", a);

	        // 11.Escape the single quote inside a character literal
	        c = '\''; 
	        System.out.printf("11 (Corrected). c = %c%n", c);

	        // 14.Declare String variable and use standard Java double quotes ("'")
	        String s14 = "'"; 
	        System.out.printf("14 (Corrected). s = %s%n", s14);

	        // 15.Use valid double quotes (or text block syntax """ """ in modern Java)
	        String s15 = ""; 
	        System.out.printf("15 (Corrected). s = \"%s\"%n", s15);

	        // 19.Use assignment operator '=' instead of comparison '==' and enclose ternary in parentheses
	        a = (a > b) ? (3 + 6) : (9 - 4);
	        System.out.printf("19 (Corrected). a = %d%n", a);
	}

	public static void main(String[] args) {
		new Ejercicio4().show();

	}

}
