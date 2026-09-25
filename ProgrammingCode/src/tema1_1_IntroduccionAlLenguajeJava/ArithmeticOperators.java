package tema1_1_IntroduccionAlLenguajeJava;

public class ArithmeticOperators {
	
	public void show() {

		int int1 = 100, int2 = 0;
		double dec1 = 20.36, dec2 = 0;

		System.out.println(int1 / int2); //Genera ArithmeticException
		System.out.println(dec1 / dec2); //Infinity
		System.out.println(dec1 % dec2); //NaN		
		
	}

	public static void main(String[] args) {

		new ArithmeticOperators().show();		

	}

}
