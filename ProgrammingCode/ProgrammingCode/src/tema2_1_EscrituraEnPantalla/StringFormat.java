package tema2_1_EscrituraEnPantalla;

public class StringFormat {
	
	public void show() {
		
		double decimal=3.8974523;
		String result;
		
		result = String.format("El número con dos decimales es %.2f", decimal);
		System.out.println(result);		
		
	}

	public static void main(String[] args) {

		new StringFormat().show();
		
	}

}