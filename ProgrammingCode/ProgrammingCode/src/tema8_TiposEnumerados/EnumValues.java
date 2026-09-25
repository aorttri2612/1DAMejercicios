package tema8_TiposEnumerados;

public class EnumValues {

	public void show() {

		// Uso de values() en un for-each
		for (Operation operation : Operation.values()) {
			System.out.println(operation);
		}

	}

	public static void main(String[] args) {

		new EnumValues().show();

	}

}
