package tema5_POO.recordsConstructorCanonico;

public class showRecordsCanonicalConstructor {
	
	public void show() {
		
		Point p1,p2;
		p1 = new Point(3,4);
		System.out.println(p1);
		p2 = new Point(5,-2);//Lanza la excepción IllegalArgumentException
		System.out.println(p2);
		
	}

	public static void main(String[] args) {
		
		new showRecordsCanonicalConstructor().show();

	}

}
