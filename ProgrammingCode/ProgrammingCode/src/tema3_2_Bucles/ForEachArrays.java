package tema3_2_Bucles;

public class ForEachArrays {
	
	public void show() {
		
		int[] grades = { 8, 7, 9 };

		for (int grade : grades) {
			System.out.printf("Nota: %d\n", grade);
		}
		
	}

	public static void main(String[] args) {

		new ForEachArrays().show();

	}

}
