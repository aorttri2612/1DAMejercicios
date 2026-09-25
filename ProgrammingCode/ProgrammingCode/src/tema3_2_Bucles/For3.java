package tema3_2_Bucles;

public class For3 {
	
	public void show() {
		
		for (int i = 0, j = 10; i <= j; i++, j--) {
			System.out.printf("i: %d j:%d\n", i, j);
		}		
		
	}

	public static void main(String[] args) {

		new For3().show();
		
	}

}
