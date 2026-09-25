package tema7_Herencia.visibilidad2;

public class Main {

	public void showVisibility() {

		Car car;
		car = new Car();

		//Error de compilación: el método accelerate de Vehicle no es visible
		car.accelerate(100);
		System.out.printf("La velocidad del coche es %.2f km/h", car.getSpeed());

		car.refuel(40.35);
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

	}

	public static void main(String[] args) {

		new Main().showVisibility();

	}

}
