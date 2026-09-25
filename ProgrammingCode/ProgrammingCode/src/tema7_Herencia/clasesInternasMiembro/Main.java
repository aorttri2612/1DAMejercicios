package tema7_Herencia.clasesInternasMiembro;

public class Main {

	public void showInnerMemberClass() {

		ContainerClass container = new ContainerClass();
		container.containerMethod();

	}

	public static void main(String[] args) {

		new Main().showInnerMemberClass();

	}

}
