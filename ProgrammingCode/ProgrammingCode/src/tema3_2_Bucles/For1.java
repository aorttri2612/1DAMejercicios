package tema3_2_Bucles;

public class For1 {
	
	public void show() {
		
		int i;

		for (i = 1; i <= 100; i++) {//i es un índice porque apunta al número de iteración del bucle
			System.out.println(i);
		}		
		
	}

	public static void main(String[] args) {

		new For1().show();
		
	}

}
