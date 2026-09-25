package tema9_ExpresionesRegulares;

public class Characters {
	
	public void show() {
		
		System.out.println("a".matches("a"));//true
		System.out.println("b".matches("a"));//false
		System.out.println("A".matches("\u0041"));//true	
		System.out.println("\n".matches("\n"));//true
		System.out.println("\t".matches("\t"));//true
		System.out.println("\\".matches("\\\\"));//true
		
	}

	public static void main(String[] args) {

		new Characters().show();
		
	}

}
