package tema11_Genericos;

import java.util.Arrays;

public class GenericClass5<T> {

	private T[] array;

	GenericClass5(T[] array) {
		this.array = array;
	}

	public void showArray() {
		System.out.println(Arrays.toString(array));
	}

	public boolean equalSize(GenericClass5<?> gen) {//Tipo comodín
		return array.length == gen.array.length;
	}

}
