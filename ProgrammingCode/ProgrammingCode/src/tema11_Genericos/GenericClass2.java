package tema11_Genericos;

public class GenericClass2<T> implements GenericInterface<T> {

	@Override
	public T first(T[] array) {
		return array[0];
	}

	@Override
	public T last(T[] array) {
		return array[array.length - 1];
	}

}
