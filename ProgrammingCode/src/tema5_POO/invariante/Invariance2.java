package tema5_POO.invariante;

public class Invariance2 {

	public void show() {

		Vehicle vehicle = new Vehicle(4, "azul");
		System.out.println(vehicle);
		vehicle.setColour("");

	}

	public static void main(String[] args) {

		new Invariance2().show();

	}

}
