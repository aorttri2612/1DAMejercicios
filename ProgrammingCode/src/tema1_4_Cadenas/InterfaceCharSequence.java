package tema1_4_Cadenas;

public class InterfaceCharSequence {
	
	public void show() {
		
		CharSequence cs = "Estoy aprendiendo a programar en Java";
        System.out.printf("Length: %d\n", cs.length());
        System.out.printf("Char at 1: %c\n", cs.charAt(1));
        System.out.printf("Subsequence (0, 5): %s",cs.subSequence(0, 5));
		
	}

	public static void main(String[] args) {

		new InterfaceCharSequence().show();

	}

}
