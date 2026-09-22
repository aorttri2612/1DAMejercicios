package tipoDatosPrimitivos;

public class Ej1 {
	
	public void show () {
		 int numero1 = 40000; //it doesn't fit in a short
		 System.out.println(numero1);
	     long numero2 = 3900750360L;
	     System.out.println(numero2); // it doesn't fit in int and to indicate that it's long i have to put the l
	     byte numero3 = 120;
	     System.out.println(numero3); 
	     short numero4 = 25500;
	     System.out.println(numero4); // it doesn't fit in a byte

	}

	public static void main(String[] args) {
		new Ej1().show();

	}

}
