package tema5_POO.recordsConstructores;

public class showRecordsConstructors {
	
	public void show() {
		
		Point p1,p2;
		p1 = new Point(3,4);
		System.out.println(p1);
		p2 = new Point();
		System.out.println(p2);
		
	}

	public static void main(String[] args) {
		
		new showRecordsConstructors().show();

	}

}
