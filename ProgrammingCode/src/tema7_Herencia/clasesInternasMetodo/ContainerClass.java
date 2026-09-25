package tema7_Herencia.clasesInternasMetodo;

public class ContainerClass {

	private int attribute = 10;

	public void containerMethod(int parameter) {

		int localVariable = 20;

		class InnerClass {

			public void innerMethod() {
				System.out.printf("Clase interna a método--->\nAtributo de la contenedora: %d", attribute);
				System.out.printf("\nVariable local: %d", localVariable);
				System.out.printf("\nParámetro: %d", parameter);
			}

		}

		InnerClass inner = new InnerClass();
		inner.innerMethod();
	}

}
