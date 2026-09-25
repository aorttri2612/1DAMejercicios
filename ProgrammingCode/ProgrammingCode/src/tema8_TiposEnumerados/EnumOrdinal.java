package tema8_TiposEnumerados;

public class EnumOrdinal {

	public void show() {

		System.out.println(Operation.PLUS.ordinal());//0
		System.out.println(Operation.MINUS.ordinal());//1
		System.out.println(Operation.TIMES.ordinal());//2
		System.out.println(Operation.DIVIDE.ordinal());//3

	}

	public static void main(String[] args) {

		new EnumOrdinal().show();

	}

}
