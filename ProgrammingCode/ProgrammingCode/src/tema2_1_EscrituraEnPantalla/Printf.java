package tema2_1_EscrituraEnPantalla;

public class Printf {
	
	public void show() {
		
		double decimal;
		int integer;

		System.out.printf("El carácter es %c%n", 'a');// El carácter es a
		integer = 10;
		System.out.printf("%d\n", integer);// 10
		System.out.printf("El 20%% de %d es %d\n", 200, 200 * 20 / 100);// El 20% de 200 es 40
		System.out.printf("%.2f\n", 12.3698);// 12,37
		decimal = 1.25036;
		System.out.printf("%.3f\n", decimal);// 1,250
		System.out.printf("%+d\n", integer);// +10
		integer = -10;
		System.out.printf("%+d\n", integer);// -10
		decimal = 3.968;
		System.out.printf("%+.2f\n", decimal);// +3,97
		decimal = -3.968;
		System.out.printf("%+f\n", decimal);// -3,968000
		decimal = 12345.6789;
		System.out.printf("%,.2f\n", decimal);// 12.345,68
		decimal = 1.25036;
		integer = 10;
		System.out.printf("decimal = %.2f integer = %d\n", decimal, integer);// decimal = 1,25 integer = 10
		System.out.printf("decimal1 = %2$.2f integer = %1$d decimal2 = %2$+.1f\n", integer, decimal);
		// decimal1 = 1,25, integer = 10, decimal2 = +1,3
		decimal = 123.4567;
		System.out.printf("El cuadrado de %.2f es %.2f\n", decimal, decimal * decimal);
		integer = 1234;
		System.out.printf("Ancho de 10 caracteres con un entero:%10d\n", integer);
		decimal = 1.25036;
		System.out.printf("Ancho de 10 caracteres con un decimal:%+10.2f\n", decimal);
		decimal = 1.25036;
		System.out.printf("Ancho de caracteres rellenado con ceros:%+010.2f\n", decimal);
		System.out.printf("Ancho de caracteres con cadenas:%10s\n", "Manolo");
		decimal = 58.965874f;
		System.out.printf("decimal=%-9.3fQue ocupe 9 caracteres, con tres decimales y alineado a la izquierda\n",
				decimal);
		System.out.printf("%-10s:Alineación a la izquierda con cadenas\n", "Manolo");
		
	}

	public static void main(String[] args) {

		new Printf().show();
		
	}

}