package tema7_Herencia.anulacionMetodos;

public class Main {

	public void showOverridde() {

		Car car;
		car = new Car();

		car.refuel(40.35);
		System.out.printf("El coche tiene %.2f litros de gasolina", car.getGasoline());
		car.accelerate(100);//Método que ha anulado al heredado
		System.out.printf("\nEl coche tiene %.2f litros de gasolina", car.getGasoline());

	}

	public static void main(String[] args) {

		new Main().showOverridde();

	}

}
