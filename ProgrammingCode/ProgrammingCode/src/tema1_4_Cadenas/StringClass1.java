package tema1_4_Cadenas;

public class StringClass1 {
	
	public void show() {
		
		String formattedString;
		formattedString = String.format("Nombre: %s Edad: %d Sueldo: %.2f", "Juan", 20, 1896.23);
		System.out.println(formattedString);
		
	}

	public static void main(String[] args) {

		new StringClass1().show();

	}

}
