package tema3_2_Bucles;

public class For2 {
	
	public void show() {
		
		for (int i = 1; i <= 100; i++) {//se declara la variable i como int dentro del for
			System.out.println(i);
		}
		i = 1;//Error de compilación		
		
	}

	public static void main(String[] args) {

		new For2().show();
		
	}

}
