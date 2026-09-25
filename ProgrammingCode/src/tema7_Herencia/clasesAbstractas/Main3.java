package tema7_Herencia.clasesAbstractas;

public class Main3 {

	public void showAbstractClass() {

		Vehicle vehicle;

		vehicle = new Car(4, "rojo");
		vehicle.accelerate(50.89);//Se ejecuta la implementación realizada en Car del método abstracto accelerate
		System.out.printf("La velocidad del coche es %.2f km/h", vehicle.getSpeed());

	}

	public static void main(String[] args) {

		new Main3().showAbstractClass();

	}

}
