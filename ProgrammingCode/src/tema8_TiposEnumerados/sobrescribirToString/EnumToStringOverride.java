package tema8_TiposEnumerados.sobrescribirToString;

public class EnumToStringOverride {

	public void show() {

		Operation operation1 = Operation.PLUS;
		Operation operation2 = Operation.MINUS;
		System.out.println(operation1.toString());//Plus
		System.out.println(operation2.toString());//Minus
		System.out.println(Operation.PLUS.toString());//Plus
		System.out.println(Operation.MINUS.toString());//Minus
	}

	public static void main(String[] args) {

		new EnumToStringOverride().show();

	}

}
