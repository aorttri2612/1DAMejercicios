package tema7_Herencia.clasesInternas;

public class Main {

	public void showInnerClass() {

		ContainerClass container = new ContainerClass();
		container.containerMethod();

	}

	public static void main(String[] args) {

		new Main().showInnerClass();

	}

}
