package tema5_POO;

public class CallsToMethods {

	public void showCallsToMethods() {

		Boolean b;
		String str;

		str = "EntornosDeDesarrollo";
		System.out.println(str.substring(10).toUpperCase()); //DESARROLLO

		b = Boolean.TRUE;
		System.out.println(b.toString().charAt(2)); //u

	}

	public static void main(String[] args) {

		new CallsToMethods().showCallsToMethods();

	}

}
