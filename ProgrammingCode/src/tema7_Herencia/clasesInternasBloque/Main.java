package tema7_Herencia.clasesInternasBloque;

public class Main {

	public void showInnerBlockClass() {

		ContainerClass container = new ContainerClass();
		container.containerMethod(30);

	}

	public static void main(String[] args) {

		new Main().showInnerBlockClass();

	}

}
