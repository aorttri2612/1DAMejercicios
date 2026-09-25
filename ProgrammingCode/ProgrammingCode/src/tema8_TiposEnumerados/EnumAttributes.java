package tema8_TiposEnumerados;

public class EnumAttributes {

	public void show() {

		Operation operation1 = Operation.PLUS;
		Operation operation2 = Operation.MINUS;
		System.out.printf("El atributo de PLUS es una cadena con el valor %c", operation1.getSymbol());
		System.out.printf("\nEl atributo de MINUS es una cadena con el valor %c", operation2.getSymbol());

	}

	public static void main(String[] args) {

		new EnumAttributes().show();

	}

}
