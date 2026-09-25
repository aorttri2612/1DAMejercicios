package tema1_3_IniciacionPOO;

public class MathClass {
	
	public void show() {
		
		System.out.println(Math.abs(-3.2));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.min(20, 5));		
		
	}

	public static void main(String[] args) {

		new MathClass().show();
		
	}

}
