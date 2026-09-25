package tema6_Excepciones;

public class StringIndexOutOfBoundsException2 {

	public void show() {

		String str = "hola";
		try {
			for (int i = 0; i <= str.length(); i++) {
				System.out.println(str.charAt(i));
			}
		} catch (StringIndexOutOfBoundsException e) {//Esto no se debe hacer
			System.err.println("Esto no se debe hacer");
		}

	}

	public static void main(String[] args) {

		new StringIndexOutOfBoundsException2().show();

	}

}
