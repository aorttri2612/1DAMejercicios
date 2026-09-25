package tema11_Genericos;

public class MyClass implements GenericInterface<Vehicle> {

	@Override
	public Vehicle first(Vehicle[] array) {
		return array[0];
	}

	@Override
	public Vehicle last(Vehicle[] array) {
		return array[array.length - 1];
	}
	
	public void show() {
		
		MyClass myClass = new MyClass();
		Vehicle[] array = new Vehicle[3];
		array[0] = new Vehicle(4, "azul");
		array[1] = new Vehicle(4, "blanco");
		array[2] = new Vehicle(2, "rojo");
		System.out.printf("Primer vehículo del array: %s\n", myClass.first(array));
		System.out.printf("Último vehículo del array: %s", myClass.last(array));
		
	}

	public static void main(String[] args) {

		new MyClass().show();
		
	}

}
