package tema11_Genericos;

public class MainGenericClass4 {

	public void show() {

		Integer[] array1 = { 8, 7, 9 };
		Integer[] array2 = { 3, 5, 12 };
		GenericClass4<Integer> gen1 = new GenericClass4<>(array1);
		GenericClass4<Integer> gen2 = new GenericClass4<>(array2);
		gen1.showArray();
		gen2.showArray();
		System.out.printf("%s tienen el mismo tamaño", gen1.equalSize(gen2) ? "Sí" : "No");

	}

	public static void main(String[] args) {

		new MainGenericClass4().show();

	}

}
