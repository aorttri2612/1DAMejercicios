package tema7_Herencia.usoSuper;

public class Main {

	public void showUsoSuper() {

		Car car;
		car = new Car();

		car.refuel(40.35);
		System.out.printf("El coche tiene %.2f litros de gasolina", car.getGasoline());
		System.out.printf(" y va a %.2f km/h", car.getSpeed());
		car.accelerate(100);
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());
		System.out.printf(" y va a %.2f km/h", car.getSpeed());

	}

	public static void main(String[] args) {

		new Main().showUsoSuper();

	}

}
