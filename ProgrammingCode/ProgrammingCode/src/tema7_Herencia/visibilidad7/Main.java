package tema7_Herencia.visibilidad7;

import tema7_Herencia.visibilidad6.Car;

public class Main {

	public void showVisibility() {

		Car car;
		car = new Car();

		car.accelerate(100);//No hay error de compilación, el método ya es visible
		System.out.printf("La velocidad del coche es %.2f km/h", car.getSpeed());

		car.refuel(40.35);
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

	}

	public static void main(String[] args) {

		new Main().showVisibility();

	}

}
