package tema7_Herencia.modificadorProtected;

public class Main {

	public void showProtected() {

		Car car;
		car = new Car();

		car.accelerate(100); //Método heredado
		System.out.printf("La velocidad del coche es %.2f km/h", car.getSpeed());

		car.refuel(40.35); //Método propio
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

	}

	public static void main(String[] args) {

		new Main().showProtected();

	}

}
