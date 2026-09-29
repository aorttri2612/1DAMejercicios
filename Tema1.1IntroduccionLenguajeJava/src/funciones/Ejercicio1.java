package funciones;


public class Ejercicio1 {
	
	public void show() {
		 int x = 10;
	        int y = 4;
	        boolean opcion = true;

        System.out.println(calculate(6, 9, true));
        System.out.println(calculate(6, 9, false));
        System.out.println(calculate(x, y, opcion));        
        System.out.println(calculate(3 + 2, 10 - 4, 2 < 5));
		
	}
	
	public int calculate(int a, int b, boolean add) {
		// if (add) { //no hemos dado esta forma de hacerlo
	      //      return a + b;
	        //} else {
	          //  return a - b;
	        //}
		return add ? a + b : a - b; //otra forma de hacerlo sin if , else
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
