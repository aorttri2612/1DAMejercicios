package wrappers;

public class Ejercicio4 {
	 boolean x = true;
     int y = 25;
     char c = 'A';
     double d = 12.5;
 public void show() {
     // Convert all variables to String
     String sx = String.valueOf(x);
     String sy = String.valueOf(y);
     String sc = String.valueOf(c);
     String sd = String.valueOf(d);

     // Concatenate all the Strings
     String resultado = sx.concat(sy).concat(sc).concat(sd);

     System.out.println(resultado);
 
 }
	public static void main(String[] args) {
	 new Ejercicio4().show();
	}

}
