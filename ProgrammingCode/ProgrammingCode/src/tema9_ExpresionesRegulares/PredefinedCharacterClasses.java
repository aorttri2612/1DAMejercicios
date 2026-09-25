package tema9_ExpresionesRegulares;

public class PredefinedCharacterClasses {
	
	public void show() {
		
		System.out.println("a".matches("."));//true
		System.out.println("?".matches("."));//true
		System.out.println("\n".matches("."));//false

		System.out.println("2".matches("\\d"));//true
		System.out.println("a".matches("\\d"));//false

		System.out.println("2".matches("\\D"));//false
		System.out.println("a".matches("\\D"));//true
		System.out.println("a2".matches("\\D\\d"));//true

		System.out.println(" ".matches("\\s"));//true
		System.out.println("\t".matches("\\s"));//true
		System.out.println("\n".matches("\\s"));//true		
		System.out.println("a".matches("\\s"));//false

		System.out.println(" ".matches("\\S"));//false
		System.out.println("a".matches("\\S"));//true
		System.out.println(" a".matches("\\s\\S"));//true

		System.out.println("_".matches("\\w"));//true
		System.out.println("B".matches("\\w"));//true
		System.out.println("9".matches("\\w"));//true
		System.out.println("?".matches("\\w"));//false

		System.out.println("a".matches("\\W"));//false
		System.out.println("*".matches("\\W"));//true
		
	}

	public static void main(String[] args) {

		new PredefinedCharacterClasses().show();
		
	}

}
