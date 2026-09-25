package tema7_Herencia.clasesInternasMiembro;

public class ContainerClass {

	private int num = 10;
	private InnerClass inner = new InnerClass();

	private class InnerClass {

		private int num = 20;

		public void innerMethod() {
			System.out.printf("Número de la contenedora: %d. Número de la interna: %d", ContainerClass.this.num, num);
		}

	}

	public void containerMethod() {
		inner.innerMethod();
	}

}
