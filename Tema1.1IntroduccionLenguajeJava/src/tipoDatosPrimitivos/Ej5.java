package tipoDatosPrimitivos;

public class Ej5 {
	public void show () {
		
		 char literal = 'P';
	     char unicode = 80;
         char escape = '\u0050';

	     System.out.println(literal);
	     System.out.println(unicode);
	     System.out.println(escape);
		
	}
	public static void main(String[] args) {
		new Ej5().show();
	}
}
