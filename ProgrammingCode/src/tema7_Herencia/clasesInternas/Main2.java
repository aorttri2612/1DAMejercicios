package tema7_Herencia.clasesInternas;

public class Main2 {

	public void showInnerClass() {

		ContainerClass container = new ContainerClass();
		ContainerClass.InnerClass inner = container.new InnerClass();
		inner.innerMethod();

	}

	public static void main(String[] args) {

		new Main2().showInnerClass();

	}

}
