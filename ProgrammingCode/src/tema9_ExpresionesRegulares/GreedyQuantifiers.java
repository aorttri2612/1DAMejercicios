package tema9_ExpresionesRegulares;

public class GreedyQuantifiers {
	
	public void show() {
		
		/*
		 * El símbolo ? sirve para indicar que la expresión que le
		 * antecede puede aparecer una o ninguna vez
		 */
		System.out.println("a".matches("a?"));//true
		System.out.println("".matches("a?"));//true
		System.out.println("b".matches("a?"));//false

		/* 
		 * El símbolo * indica que la expresión puede repetirse 
		 * ninguna o varias veces
		 */
		System.out.println("a".matches("a*"));//true
		System.out.println("".matches("a*"));//true
		System.out.println("aaaa".matches("a*"));//true
		System.out.println("b".matches("a*"));//false

		/* 
		 * El símbolo + indica que la expresión puede repetirse
		 * una o varias veces
		 */
		System.out.println("a".matches("a+"));//true
		System.out.println("aaaa".matches("a+"));//true
		System.out.println("".matches("a+"));//false
		System.out.println("b".matches("a+"));//false

		//Un número entre llaves indica las veces que se repite la expresión
		System.out.println("aaa".matches("a{3}"));//true
		System.out.println("aaa".matches("a{4}"));//false

		/*
		 * Un número entre llaves con una coma indica el mínimo
		 * de veces que se repite la expresión
		 */
		System.out.println("aaa".matches("a{3,}"));//true
		System.out.println("aaaaa".matches("a{3,}"));//true
		System.out.println("aa".matches("a{3,}"));//false

		/*
		 * Como el anterior pero aparece un segundo número que
		 * indica el máximo de veces que se repite la expresión
		 */
		System.out.println("aaa".matches("a{3,6}"));//true
		System.out.println("aaaaaa".matches("a{3,6}"));//true
		System.out.println("aa".matches("a{3,6}"));//false
		System.out.println("aaaaaaa".matches("a{3,6}"));//false
		
	}

	public static void main(String[] args) {

		new GreedyQuantifiers().show();

	}

}
