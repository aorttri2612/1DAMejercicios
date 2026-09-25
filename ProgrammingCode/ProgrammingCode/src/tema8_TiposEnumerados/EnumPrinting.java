package tema8_TiposEnumerados;

public class EnumPrinting {

	public void show() {

		Operation operation1 = Operation.PLUS;
		Operation operation2 = Operation.MINUS;
		System.out.println(operation1);//PLUS
		System.out.println(operation2);//MINUS
		System.out.println(Operation.PLUS);//PLUS
		System.out.println(Operation.MINUS);//MINUS

	}

	public static void main(String[] args) {

		new EnumPrinting().show();

	}

}
