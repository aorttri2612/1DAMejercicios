package tema5_POO.records;

public class showRecords {
	
	public void show() {
		
		Point p = new Point(3,4);
		System.out.println(p);//Llama por defecto al toString
		System.out.println(p.x());
		System.out.println(p.y());
		System.out.println(p.equals(new Point(3,4)));
		System.out.println(p.hashCode());
		
	}

	public static void main(String[] args) {
		
		new showRecords().show();

	}

}
