package tipoDatosPrimitivos;

public class Ej1 {
	
	public void show () {
		 int num1 = 40000; //it doesn't fit in a short
		 System.out.println(num1);
	     long num2 = 3900750360L;
	     System.out.println(num2); // it doesn't fit in int and to indicate that it's long i have to put the l
	     byte num3 = 120;
	     System.out.println(num3); 
	     short num4 = 25500;
	     System.out.println(num4); // it doesn't fit in a byte

	}

	public static void main(String[] args) {
		new Ej1().show();

	}

}
