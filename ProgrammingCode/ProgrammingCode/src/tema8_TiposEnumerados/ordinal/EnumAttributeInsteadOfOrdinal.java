package tema8_TiposEnumerados.ordinal;

public class EnumAttributeInsteadOfOrdinal {

	public void show() {

		System.out.println(Operation.PLUS.getOptionNumber());//1
		System.out.println(Operation.MINUS.getOptionNumber());//2
		System.out.println(Operation.TIMES.getOptionNumber());//3
		System.out.println(Operation.DIVIDE.getOptionNumber());//4

	}

	public static void main(String[] args) {

		new EnumAttributeInsteadOfOrdinal().show();

	}

}
