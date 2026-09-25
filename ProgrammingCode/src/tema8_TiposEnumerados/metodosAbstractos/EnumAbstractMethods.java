package tema8_TiposEnumerados.metodosAbstractos;

public class EnumAbstractMethods {

	public void show() {

		for (Operation operation : Operation.values()) {
			System.out.printf("%-8s  %.2f %c %.2f = %.2f\n", operation + ":", 5f, operation.getSymbol(), 3f,
					operation.apply(5, 3));
		}

	}

	public static void main(String[] args) {

		new EnumAbstractMethods().show();

	}

}
