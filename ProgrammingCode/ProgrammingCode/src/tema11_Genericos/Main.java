package tema11_Genericos;

public class Main {
	
	public void show() {
		
		Integer[] array1 = { 8, 7, 9 };
		Double[] array2 = { 3.6, 5.4, 12.42 };
		GenericClass4<Integer> gen1 = new GenericClass4<>(array1);
		GenericClass4<Double> gen2 = new GenericClass4<>(array2);
		gen1.showArray();
		gen2.showArray();
		System.out.printf("%s tienen el mismo tamaño", gen1.equalSize(gen2) ? "Sí" : "No");
		
	}

	public static void main(String[] args) {

		new Main().show();
		
	}

}
