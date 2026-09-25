package tema12_Colecciones.mapas;

public class ExampleUseMapEnum {

	public void show() {

		Operation operation;
		operation = Operation.fromSymbol('+');//operation se asigna con la instancia correspondiente al símbolo +
		System.out.printf("La variable operation es de tipo enum %s y su símbolo es %c", operation,
				operation.getSymbol());

	}

	public static void main(String[] args) {

		new ExampleUseMapEnum().show();

	}

}
