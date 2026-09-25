package tema11_Genericos;

import java.util.Arrays;

public class GenericClass4<T> {

	private T[] array;

	GenericClass4(T[] array) {
		this.array = array;
	}

	public void showArray() {
		System.out.println(Arrays.toString(array));
	}

	public boolean equalSize(GenericClass4<T> gen) {
		return array.length == gen.array.length;
	}

}
