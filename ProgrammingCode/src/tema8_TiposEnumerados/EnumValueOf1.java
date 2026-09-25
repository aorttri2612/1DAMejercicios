package tema8_TiposEnumerados;

public class EnumValueOf1 {

	public void show() {

		Operation operation;
		operation = Operation.valueOf("PLUS");//operation se asigna con la instancia correspondiente a la constante de enumeración PLUS 
		System.out.printf("La variable operation es de tipo enum %s y su símbolo es %c", operation,
				operation.getSymbol());

	}

	public static void main(String[] args) {

		new EnumValueOf1().show();

	}

}
