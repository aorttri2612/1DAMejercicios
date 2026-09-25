package expresiones;

public class Ej1 {
	
	public void show() {
		final int a = 3, b = 5, c= 4, d = 2, result1, final1;
		final int e = 7 ,result2 ,result22, final2;
		final int f = 8, result3, result33;
		final int result4, g = 6;
		boolean final3, final4, final5;
		
		//1 3*5-4/2
		result1 = a * b ;
		final1 = result1 - c/d;
		System.out.println(final1);
		//2 7-4*2-5*2
		result2 = c * d;
		result22 = b * d;
		final2 = e - result2 - result22;
		System.out.println(final2);
		//3 5 + 4 < 7 + 8
		result3 = b + c;
		result33 = e + f;
		final3 = result3 < result33;
	    System.out.println(final3);
	    //4 < 5 * 4 / 2 – 7
	    result4 = b*c/d - e;
	    final4 = c < result4;
	    System.out.println(final4);
	    //! (4 > 6)
	    final5 = !(c > g);
	    System.out.println(final5);
	}

	public static void main(String[] args) {
		new Ej1().show();

	}
}
