package tema4_1_ArraysUnidimensionales;

public class Join {

	public void show() {

		String[] words = {"Estoy", "aprendiendo", "a", "programar"};
		String[] colors = {"Rojo", "Verde", "Azul", "Amarillo"};
        System.out.println(String.join(" ", words)); //Estoy aprendiendo a programar
        System.out.println(String.join(", ", colors)); //Rojo, Verde, Azul, Amarillo

	}

	public static void main(String[] args) {

		new Join().show();

	}

}
