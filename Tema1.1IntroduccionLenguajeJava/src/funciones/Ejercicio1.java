package funciones;


public class Ejercicio1 {
	
	public void show() {
		   
        System.out.println(calcular(6, 9, true));

        
        System.out.println(calcular(6, 9, false));

        
        int x = 10;
        int y = 4;
        boolean opcion = true;

        System.out.println(calcular(x, y, opcion));

        
        System.out.println(calcular(3 + 2, 10 - 4, 2 < 5));
		
	}
	
	public int calcular(int a, int b, boolean sumar) {
		 if (sumar) {
	            return a + b;
	        } else {
	            return a - b;
	        }
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
