package tema5_POO.sintaxisFluida;

public class Main {

	public void showfluidSintax() {

		Vehicle1 car1;
		Vehicle2 car2;
		car1 = new Vehicle1(4, "rojo");
		car2 = new Vehicle2(4, "azul");

		car1.accelerate(120.55);
		car1.brake(20.32);
		System.out.printf("Velocidad del coche1: %.2f", car1.getSpeed());

		/* car2 hace en una línea de código lo mismo que car1 
		 * hace en 3 líneas de código debido a que car2 utiliza 
		 * sintaxis fluida:
		 */
		System.out.printf("\nVelocidad del coche2: %.2f", car2.accelerate(120.55).brake(20.32).getSpeed());

	}

	public static void main(String[] args) {

		new Main().showfluidSintax();

	}

}
