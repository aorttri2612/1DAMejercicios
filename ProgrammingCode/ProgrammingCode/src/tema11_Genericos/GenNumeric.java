package tema11_Genericos;

public class GenNumeric<T extends Number> { //Limitamos T a tipos numéricos

	private T attribute;

	public GenNumeric(T attribute) {
		this.attribute = attribute;

	}

	public T getAttribute() {
		return attribute;
	}

	double fraction() {
		return attribute.doubleValue() - attribute.intValue(); //Se pueden emplear métodos de la clase Number
	}

}
