package tema1_4_Cadenas;

public class StringJoin {
	
	public void show() {
		
		String result = String.join(" - ", "Rojo", "Verde", "Azul");
        System.out.println(result); //Rojo - Verde - Azul
		
	}

	public static void main(String[] args) {

		new StringJoin().show();

	}

}
