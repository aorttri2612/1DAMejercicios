package tema5_POO.thisObjetoActual2;

public class Main {

	public void showthisCurrentObject2() {

		Vehicle car1, car2;
		car1 = new Vehicle(4, "azul");
		car2 = new Vehicle(4, "rojo");
		car1.accelerate(90.3);
		car2.accelerate(120.5);
		System.out.printf("Velocidad del coche1: %.2f", car1.getSpeed());
		System.out.printf("\nVelocidad del coche2: %.2f", car2.getSpeed());
		System.out.printf("\nSuma de las velocidades de los dos coches: %.2f", car1.addSpeeds(car2));
		car1.doubleSpeed();
		System.out.printf("\nEl coche1 ha doblado su velocidad: %.2f", car1.getSpeed());

	}

	public static void main(String[] args) {

		new Main().showthisCurrentObject2();

	}

}
