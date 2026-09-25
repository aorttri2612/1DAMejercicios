package expresiones;

public class Ejercicio2 {
	
	public void show() {
		boolean a = true, b= false, c= true;
		boolean final1, final2, final3, final4;
		//a && b  || a && c
		final1 = a && b  || a && c;
		//(a || ! b) && (! a || c)
		final2 = (a || ! b) && (! a || c);
		//a || b && c
		final3 = a || b && c;
		//! (a || b) && c
		final4 = ! (a || b) && c;
		System.out.println(final1);
		System.out.println(final2);
		System.out.println(final3);
		System.out.println(final4);
		
	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
