package tema7_Herencia.usosFinal;

public class Main {

	public void showUsosFinal() {

		final Car car = new Car(4, "rojo");
		car = new Car(4, "blanco");//Error: la variable car no puede referenciar a otro objeto

	}

	public static void main(String[] args) {

		new Main().showUsosFinal();

	}

}
