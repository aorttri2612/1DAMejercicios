package math;

public class Ejercicio1 {
	
	public void show() {
		  // 1. abs(float a) - Returns the absolute value of a number
        float num1 = -8.5f;
        System.out.printf("1. abs(%.1f) = %.1f%n", num1, Math.abs(num1));

        // 2. exp(double a) - Returns e raised to the power of a
        double num2 = 2;
        System.out.printf("2. exp(%.0f) = %.4f%n", num2, Math.exp(num2));

        // 3. pow(double a, double b) - Returns a raised to the power of b
        double base = 3;
        double exponente = 4;
        System.out.printf("3. pow(%.0f, %.0f) = %.0f%n",
                base, exponente, Math.pow(base, exponente));

        // 4. max(double a, double b) - Returns the greater of two values
        double num3 = 7.5;
        double num4 = 12.3;
        System.out.printf("4. max(%.1f, %.1f) = %.1f%n",
                num3, num4, Math.max(num3, num4));

        // 5. min(int a, int b) - Returns the smaller of two values
        int num5 = 15;
        int num6 = 9;
        System.out.printf("5. min(%d, %d) = %d%n",
                num5, num6, Math.min(num5, num6));

        // 6. ceil(double a) - Returns the smallest integer greater than or equal to a
        double positivo = 4.3;
        double negativo = -4.3;

        System.out.printf("6. ceil(%.1f) = %.1f%n",
                positivo, Math.ceil(positivo));

        System.out.printf("   ceil(%.1f) = %.1f%n",
                negativo, Math.ceil(negativo));

        // 7. floor(double a) - Returns the largest integer less than or equal to a
        double positivo2 = 4.7;
        double negativo2 = -4.7;

        System.out.printf("7. floor(%.1f) = %.1f%n",
                positivo2, Math.floor(positivo2));

        System.out.printf("   floor(%.1f) = %.1f%n",
                negativo2, Math.floor(negativo2));
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
