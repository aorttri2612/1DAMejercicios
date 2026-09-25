package tema5_POO.instanceofObjetos;

public class Main {

	public void showInstanceof() {

		Vehicle vehicle;
		vehicle = new Vehicle(2, "azul");
		System.out.println(vehicle instanceof Vehicle);//true

	}

	public static void main(String[] args) {

		new Main().showInstanceof();

	}

}