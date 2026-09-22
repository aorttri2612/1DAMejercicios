package tipoDatosPrimitivos;

public class Ej3 {
	
	public void show () {
		float f = (float) 9.87;
		int i;
		i = (int) f;
		System.out.println(f);
		System.out.println(i); // int can't take decimal values
	}
	public static void main(String[] args) {
		new Ej3().show();

	}
}
