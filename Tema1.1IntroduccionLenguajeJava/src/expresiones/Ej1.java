package expresiones;

public class Ej1 {
	
	public void show() {
		int a = 3, b = 5, c= 4, d = 2, result, final1;
		result = c / d ;
		final1 = a * b - result;
		System.out.println(final1);
	}

	public static void main(String[] args) {
		new Ej1().show();

	}
}
