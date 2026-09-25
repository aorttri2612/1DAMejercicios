package tema7_Herencia.clasesAnidadasEstaticas;

public class ContainerClass {

	public static class StaticNestedClass {

		public void staticNestedMethod() {
			System.out.println("Clase anidada estática");
		}

	}

	public void containerMethod() {
		System.out.println("Clase externa o contenedora");
	}

}
