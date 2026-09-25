package tema7_Herencia.clasesInternasMetodo;

public class Main {

	public void showInnerMethodClass() {

		ContainerClass container = new ContainerClass();
		container.containerMethod(30);

	}

	public static void main(String[] args) {

		new Main().showInnerMethodClass();

	}

}
