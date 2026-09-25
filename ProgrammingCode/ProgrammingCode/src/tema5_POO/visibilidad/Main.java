package tema5_POO.visibilidad;

public class Main {

	public void showVisibility() {

		Vehicle car;
		car = new Vehicle(4, "azul");
		//getWheelCount() es visible porque es friendly y la clase Main está en el mismo paquete que la clase Vehicle
		System.out.printf("El coche tiene %d ruedas", car.getWheelCount());
		//accelerate(100) es visible porque es public
		car.accelerate(100);
		//Error de compilación: speed no es visible porque es private
		System.out.printf("\nEl coche va a %.2f km/h", car.speed);

	}

	public static void main(String[] args) {

		new Main().showVisibility();

	}

}
