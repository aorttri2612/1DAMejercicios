package tema7_Herencia.clasesAbstractas;

public class Main2 {

	public void showAbstractClass() {

		Vehicle vehicle;
		vehicle = new Vehicle(2, "azul");//Error de compilación: no se puede instanciar el tipo myClass
	}

	public static void main(String[] args) {

		new Main2().showAbstractClass();

	}

}
