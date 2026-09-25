package tema8_TiposEnumerados.implementacionInterfaces;

public class InterfacesImplementation {

	public void show() {

		for (Operation operation : BasicOperation.values()) {
			show(operation);
		}
		for (Operation operation : ExtendedOperation.values()) {
			show(operation);
		}

	}

	public void show(Operation operation) {

		System.out.printf("%-10s  %.2f %c %.2f = %.2f\n", operation + ":", 5f, operation.getSymbol(), 3f,
				operation.apply(5, 3));

	}

	public static void main(String[] args) {

		new InterfacesImplementation().show();

	}

}
