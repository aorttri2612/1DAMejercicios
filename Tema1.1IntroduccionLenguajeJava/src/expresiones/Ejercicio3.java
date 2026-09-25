package expresiones;



public class Ejercicio3 {
	
	public void show() {
		int x = 165698; 
		// The L was removed because int can store this integer value.
        System.out.println(x);
		short s = 56;
		byte b = (byte) s;
		/* A casting is needed because short is larger than byte.*/
		System.out.println(b);

		int b1 = 129;
		/* 129 does not fit in a byte, so int is used instead.And if 
		 * i put a casting it overflows*/
        System.out.println(b1);
		float f = 5.89f;
		// The f is needed because decimal literals are double by default.
        System.out.println(f);
		double l = 8.42;
		// long cannot store decimal values, so double is used.
        System.out.println(l);
		char c1 = 'a';
		char c2;
		c2 = (char) (c1 + 7);
		/* c1 + 7 produces an int, so a casting is 
		needed to convert it to char.*/
        System.out.println(c2);
		byte b2;
		short s2 = 7;
		boolean a = true;

		b2 = (byte) (a ? s2++ : --s2);
		/* The ternary expression produces a short, 
		so a casting is needed to convert it to byte.*/
		System.out.println(b2);
	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
