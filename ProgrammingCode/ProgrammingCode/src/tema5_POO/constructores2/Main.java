package tema5_POO.constructores2;

public class Main {

	public void showConstructors2() {

		Vehicle moto;
		Vehicle car = new Vehicle();//Error de compilación: el constructor myClass() no está definido
		moto = new Vehicle(2, "rojo");
		System.out.println(car);
		System.out.println(moto);

	}

	public static void main(String[] args) {

		new Main().showConstructors2();

	}

}
