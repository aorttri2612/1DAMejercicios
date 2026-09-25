package tema11_Genericos;

public class MainGenericClass2 {

	public void show() {

		Vehicle[] array = new Vehicle[3];
		array[0] = new Vehicle(4, "azul");
		array[1] = new Vehicle(4, "blanco");
		array[2] = new Vehicle(2, "rojo");
		GenericClass2<Vehicle> genVehicle = new GenericClass2<>();
		System.out.printf("Primer vehículo del array: %s\n", genVehicle.first(array));
		System.out.printf("Último vehículo del array: %s", genVehicle.last(array));

	}

	public static void main(String[] args) {

		new MainGenericClass2().show();

	}

}
