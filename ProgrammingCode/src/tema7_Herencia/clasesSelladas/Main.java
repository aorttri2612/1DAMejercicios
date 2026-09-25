package tema7_Herencia.clasesSelladas;

public class Main {

	public void showSealedClasses() {

		Vehicle v;
		
		v = new Car(4, "rojo");
		System.out.println(v);
		v = new Bike(2, "verde");
		System.out.println(v);
		v = new Motorbike(2, "azul");
		System.out.println(v);		

	}

	public static void main(String[] args) {

		new Main().showSealedClasses();

	}

}
