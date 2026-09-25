package tema11_Genericos;

public class MainGenericClass3 {

	public void show() {

		GenericClass3<Integer, Integer> variousGenerics1 = new GenericClass3<>(80, 56);
		GenericClass3<Integer, Double> variousGenerics2 = new GenericClass3<>(5, 78.6);
		GenericClass3<String, Vehicle> variousGenerics3 = new GenericClass3<>("Clases genéricas",
				new Vehicle(4, "azul"));
		variousGenerics1.showAttributes();
		variousGenerics2.showAttributes();
		variousGenerics3.showAttributes();

	}

	public static void main(String[] args) {

		new MainGenericClass3().show();

	}

}
