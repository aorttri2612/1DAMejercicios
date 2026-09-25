package tipoDatosPrimitivos;

public class Ejercicio2 {
	
	public void show () {
		
		short s = 30000;
		byte b;
		
		b = (byte) s;
		
		System.out.println(b); /* 48 because the byte can't take all of 
		the s and overflows and only retains 8 bytes less significant*/
		
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
