package tema7_Herencia.clasesAbstractas;

public class Main {

	public void showAbstractClass() {

		Car car;

		car = new Car(4, "rojo");

		System.out.printf("La velocidad del coche es %.2f km/h", car.getSpeed());
		car.refuel(40.35);
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

		car.accelerate(100);
		System.out.printf("\nLa velocidad del coche es %.2f km/h", car.getSpeed());
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

	}

	public static void main(String[] args) {

		new Main().showAbstractClass();

	}

}
