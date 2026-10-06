package introduccion;

public class Ejercicio2 {

	public void show() {
		  String phrase1 = "Hola";
	        String phrase2 = new String("Hola");

	        System.out.println(phrase1 == phrase2); // it look if the two variables look to the same object 
	        System.out.println(phrase1.equals(phrase2)); // looks if it aims the same content

	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
