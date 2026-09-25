package tema5_POO;

public class GetClassMethods {

	public void show() {

		Boolean b = Boolean.TRUE;
		String str = "EntornosDeDesarrollo";

		System.out.println(str.getClass().getName()); //java.lang.String
		System.out.println(str.getClass().getSimpleName()); //String

		System.out.println(b.getClass().getName()); //java.lang.Boolean
		System.out.println(b.getClass().getSimpleName()); //Boolean

	}

	public static void main(String[] args) {

		new GetClassMethods().show();

	}

}
