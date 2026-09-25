package tema9_ExpresionesRegulares;

public class BoundaryMatchers {
	
	public void show() {
		
		System.out.println("hola".matches("^hola"));//true
		System.out.println("hola9".matches("^hola"));//false
		System.out.println("hola9".matches("^hola\\d"));//true
		System.out.println("ab".matches("^[aA]\\p{Lower}"));//true
		System.out.println("bA".matches("^[aA]\\p{Upper}"));//false

		System.out.println("hhola".matches(".hola$"));//true
		System.out.println("hola".matches(".hola$"));//false
		System.out.println("9hola".matches("\\dhola$"));//true
		System.out.println("hc".matches(".[abc]$"));//true
		System.out.println("ch".matches(".[abc]$"));//false

		/*
		 * La expresión regular \b se llama límite de palabra 
		 * ya que busca en los límites de una palabra, al 
		 * principio o al final:
		 */
		System.out.println("hola".matches("\\bhol."));//true, hol está al principio de una palabra
		System.out.println("hola".matches(".ola\\b"));//true, ola está al final de una palabra
		/*
		 * Para realizar una búsqueda de palabras específicas 
		 * se coloca la palabra entre dos límites de palabra: 
		 */
		System.out.println("hola".matches("\\bhola\\b"));//true, hola está al principio y al final

		// \B es justo lo contrario que \b
		System.out.println("abc".matches(".\\Bb\\B."));//true, b no está al principio ni al final
		System.out.println("abc".matches("a\\B.."));//true, a no está al final		
		
	}

	public static void main(String[] args) {

		new BoundaryMatchers().show();

	}

}