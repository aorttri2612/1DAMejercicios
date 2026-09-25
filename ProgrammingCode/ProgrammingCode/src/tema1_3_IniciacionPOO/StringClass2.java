package tema1_3_IniciacionPOO;

public class StringClass2 {
	
	public void show() {
		
		String str = "hola";
		System.out.println(str.charAt(0));//h
		System.out.println(str.charAt(1));//o
		System.out.println(str.charAt(2));//l
		System.out.println(str.charAt(3));//a
		System.out.println(str.length());//4
		System.out.println(str.equals("hola"));//true
		System.out.println(str.equals("adiós"));//false

		//También se le pueden aplicar métodos a un literal cadena:
		System.out.println("hola".equals("hola")); //true
		System.out.println("adios".equals("hola"));//false		
		
	}

	public static void main(String[] args) {

		new StringClass2().show();

	}

}
