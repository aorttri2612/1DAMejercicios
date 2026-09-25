package tema7_Herencia.clasesAnidadasEstaticas;

public class Main {

	public void showStaticNestedClass() {

		ContainerClass.StaticNestedClass nested = new ContainerClass.StaticNestedClass();
		nested.staticNestedMethod();

		ContainerClass container = new ContainerClass();
		container.containerMethod();

	}

	public static void main(String[] args) {

		new Main().showStaticNestedClass();

	}

}
