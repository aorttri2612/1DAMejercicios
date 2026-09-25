package tema8_TiposEnumerados;

public class EnumName {

	public void show() {

		Operation operation1 = Operation.PLUS;
		Operation operation2 = Operation.MINUS;
		System.out.println(operation1.name());//PLUS
		System.out.println(operation2.name());//MINUS
		System.out.println(Operation.PLUS.name());//PLUS
		System.out.println(Operation.MINUS.name());//MINUS
	}

	public static void main(String[] args) {

		new EnumName().show();

	}

}
