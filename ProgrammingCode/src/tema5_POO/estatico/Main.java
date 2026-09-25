package tema5_POO.estatico;

public class Main {

	public void showStatic() {

		System.out.printf("Valor de a: %d", MyClass.a);
		System.out.printf("\nValor de b: %d", MyClass.b);

	}

	public static void main(String[] args) {

		new Main().showStatic();

	}

}
