package tema5_POO.thisObjetoActual1;

public class Main {

	public void showthisCurrentObject1() {

		Vehicle car1, car2;
		car1 = new Vehicle(4, "azul");
		System.out.printf("Coche1: %d ruedas, color %s, velocidad %.2f", car1.getWheelCount(), car1.getColour(),
				car1.getSpeed());
		car2 = car1.accelerate(90);
		System.out.println("\nAceleramos el coche1 y se lo asignamos al coche2");
		System.out.printf("Coche1: %d ruedas, color %s, velocidad %.2f", car1.getWheelCount(), car1.getColour(),
				car1.getSpeed());
		System.out.printf("\nCoche2: %d ruedas, color %s, velocidad %.2f", car2.getWheelCount(), car2.getColour(),
				car2.getSpeed());
	}

	public static void main(String[] args) {

		new Main().showthisCurrentObject1();

	}

}
