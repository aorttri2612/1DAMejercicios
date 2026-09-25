package tema5_POO.noEncapsulacion;

public class Main {

	public void showNonEncapsulation() {

		Vehicle car;
		car = new Vehicle(4, "azul");
		car.accelerate(90.54);
		System.out.printf("Velocidad: %.2f", car.speed);
		car.speed = 120;//El cliente está accediendo al atributo directamente no cumpliendo el encapsulamiento
		System.out.printf("\nVelocidad: %.2f", car.speed);

	}

	public static void main(String[] args) {

		new Main().showNonEncapsulation();

	}

}
