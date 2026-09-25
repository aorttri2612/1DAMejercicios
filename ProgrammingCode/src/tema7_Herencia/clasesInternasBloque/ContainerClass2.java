package tema7_Herencia.clasesInternasBloque;

public class ContainerClass2 {

	private int attribute = 10;

	public void containerMethod(int parameter) {

		int localVariable = 20;

		if (parameter > localVariable) {
			class InnerClass {

				public void innerMethod() {
					System.out.printf("Clase interna a bloque--->\nAtributo de la contenedora: %d", attribute);
					System.out.printf("\nVariable local: %d", localVariable);
					System.out.printf("\nParámetro: %d", parameter);
				}

			}

		}

		InnerClass inner = new InnerClass();//Error de compilación: InnerClass no puede ser resuelto como un tipo
		inner.innerMethod();

	}

}
