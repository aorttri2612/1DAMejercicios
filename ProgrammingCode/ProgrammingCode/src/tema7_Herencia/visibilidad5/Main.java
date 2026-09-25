package tema7_Herencia.visibilidad5;

import tema7_Herencia.visibilidad4.Car;

public class Main {

	public void showVisibility() {

		Car car;
		car = new Car();

		car.accelerate(100);////Error de compilación: el método accelerate de Car no es visible
		System.out.printf("La velocidad del coche es %.2f km/h", car.getSpeed());

		car.refuel(40.35);
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

	}

	public static void main(String[] args) {

		new Main().showVisibility();

	}

}
