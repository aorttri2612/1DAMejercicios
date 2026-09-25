package tema12_Colecciones;

import java.util.List;

public class Join {

	public void show() {

		List<String> elements = List.of("Manzana", "Pera", "Naranja");
        System.out.println(String.join(", ", elements)); //Manzana, Pera, Naranja
        
	}

	public static void main(String[] args) {

		new Join().show();

	}

}
