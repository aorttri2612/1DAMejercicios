package tema11_Genericos;

public class GenericClass<T> {//Clase genérica de tipo T

	private T attribute;//Declaramos un atributo de tipo T

	public GenericClass(T attribute) {
		this.attribute = attribute;

	}

	public T getAttribute() {
		return attribute;
	}

	public void show() {
		System.out.printf("El tipo de T es %s", attribute.getClass().getSimpleName());
		System.out.printf("  --->  Valor del atributo: %s\n", getAttribute());
	}

}
