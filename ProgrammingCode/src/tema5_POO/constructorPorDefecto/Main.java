package tema5_POO.constructorPorDefecto;

public class Main {

	public void showDefaultConstructor() {

		Vehicle car1, car2;
		car1 = new Vehicle();
		car2 = new Vehicle();
		System.out.printf("Coche 1: %s", car1);
		System.out.printf("\nCoche 2: %s", car2);

	}

	public static void main(String[] args) {

		new Main().showDefaultConstructor();

	}

}
