package tema6_Excepciones;

public class StringIndexOutOfBoundsException1 {

	public void show() {

		String str = "hola";
		for (int i = 0; i <= str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public static void main(String[] args) {

		new StringIndexOutOfBoundsException1().show();

	}

}
