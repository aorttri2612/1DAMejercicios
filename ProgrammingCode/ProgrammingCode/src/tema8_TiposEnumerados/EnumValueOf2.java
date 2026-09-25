package tema8_TiposEnumerados;

public class EnumValueOf2 {

	public void show() {

		Operation operation;
		operation = Operation.valueOf("PLUS1");//PLUS1 no se corresponde con ninguna constante de enumeración
		System.out.printf("La variable operation es de tipo enum %s y su símbolo es %c", operation,
				operation.getSymbol());

	}

	public static void main(String[] args) {

		new EnumValueOf2().show();

	}

}
