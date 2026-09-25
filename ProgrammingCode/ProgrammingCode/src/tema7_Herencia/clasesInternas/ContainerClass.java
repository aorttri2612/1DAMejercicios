package tema7_Herencia.clasesInternas;

public class ContainerClass {

	private int numContainer = 10;

	public class InnerClass {

		public void innerMethod() {
			System.out.printf("Clase interna. Puede acceder a numContainer: %d", numContainer);
		}

	}

	public void containerMethod() {
		InnerClass inner = new InnerClass();
		inner.innerMethod();
	}

}
