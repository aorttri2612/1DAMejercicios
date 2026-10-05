package tipoDatosPrimitivos;

public class Ejercicio3 {
	
	public void show () {
		float f = 9.87f;
		int i;
		i = (int) f;
		System.out.println(f);
		System.out.println(i); // int can't take decimal values
	}
	public static void main(String[] args) {
		new Ejercicio3().show();

	}
}
