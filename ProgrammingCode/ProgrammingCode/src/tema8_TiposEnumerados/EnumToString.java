package tema8_TiposEnumerados;

public class EnumToString {

	public void show() {

		Operation operation1 = Operation.PLUS;
		Operation operation2 = Operation.MINUS;
		System.out.println(operation1.toString());//PLUS
		System.out.println(operation2.toString());//MINUS
		System.out.println(Operation.PLUS.toString());//PLUS
		System.out.println(Operation.MINUS.toString());//MINUS
	}

	public static void main(String[] args) {

		new EnumToString().show();

	}

}
