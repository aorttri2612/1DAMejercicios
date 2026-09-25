package tema5_POO.constructorConParametros;

public class Main {

	public void showParameterizedConstructor() {

		Vehicle car, moto;
		car = new Vehicle(4, "azul");
		moto = new Vehicle(2, "rojo");
		System.out.println(car);
		System.out.println(moto);

	}

	public static void main(String[] args) {

		new Main().showParameterizedConstructor();

	}

}
