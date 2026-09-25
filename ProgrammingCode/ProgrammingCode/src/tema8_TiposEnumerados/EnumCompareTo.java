package tema8_TiposEnumerados;

public class EnumCompareTo {

	public void show() {

		System.out.println(Operation.MINUS.compareTo(Operation.DIVIDE));//-2
		System.out.println(Operation.TIMES.compareTo(Operation.MINUS));//1
		System.out.println(Operation.PLUS.compareTo(Operation.PLUS));//0

	}

	public static void main(String[] args) {

		new EnumCompareTo().show();

	}

}
