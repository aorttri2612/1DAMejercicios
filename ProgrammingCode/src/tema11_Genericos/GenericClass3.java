package tema11_Genericos;

public class GenericClass3<T, V> {

	private T attribute1;
	private V attribute2;

	public GenericClass3(T attribute1, V attribute2) {
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}

	public T getAttribute1() {
		return attribute1;
	}

	public V getAttribute2() {
		return attribute2;
	}

	public void showAttributes() {
		System.out.printf("El tipo de T es %s", attribute1.getClass().getSimpleName());
		System.out.printf("  --->  Valor del atributo: %s\n", getAttribute1());
		System.out.printf("El tipo de V es %s", attribute2.getClass().getSimpleName());
		System.out.printf("  --->  Valor del atributo: %s\n\n", getAttribute2());

	}

}
