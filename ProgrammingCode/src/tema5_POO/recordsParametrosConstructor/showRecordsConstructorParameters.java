package tema5_POO.recordsParametrosConstructor;

public class showRecordsConstructorParameters {
	
	public void show() {
		
		Point p1 = new Point(3, 4);  
        Point p2 = new Point(-5, 10); 
        Point p3 = new Point(7, -8);  

        System.out.println(p1); 
        System.out.println(p2);
        System.out.println(p3); 
		
	}

	public static void main(String[] args) {
		
		new showRecordsConstructorParameters().show();

	}

}
