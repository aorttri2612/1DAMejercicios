package tema5_POO.constructores1;

public class Main {

	public void showConstructors1() {

		Vehicle car, moto;
		car = new Vehicle();
		moto = new Vehicle(2, "rojo");
		System.out.println(car);
		System.out.println(moto);

	}

	public static void main(String[] args) {

		new Main().showConstructors1();

	}

}
