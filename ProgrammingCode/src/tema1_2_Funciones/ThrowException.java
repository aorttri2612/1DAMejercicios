package tema1_2_Funciones;

public class ThrowException {
	
	public void show() {
		
		int result;

		result = factorial(-5);//Al que utilice la función con números negativos le salta un error
		System.out.printf("El factorial de %d es %d\n", -5, result);
		
	}
	
	public int factorial(int n) {

		int result = 1;

		if (n < 0) {
			throw new IllegalArgumentException("El factorial se aplica a números positivos");
		}

		for (int i = 2; i <= n; i++) {
			result *= i;
		}

		return result;
	}

	public static void main(String[] args) {

		new ThrowException().show();
		
	}

}
