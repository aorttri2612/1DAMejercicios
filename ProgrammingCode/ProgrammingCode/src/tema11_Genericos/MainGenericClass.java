package tema11_Genericos;

public class MainGenericClass {

	public void show() {

		//T es un parámetro de tipo que se sustituye por un tipo real al crear un objeto de la clase
		GenericClass<Integer> genInteger;//Se sustituye T por Integer
		GenericClass<Double> genDouble;//Se sustituye T por Double
		GenericClass<String> genString;//Se sustituye T por String
		GenericClass<Vehicle> genVehicle;//Se sustituye T por Vehicle

		genInteger = new GenericClass<Integer>(80);
		genDouble = new GenericClass<Double>(78.6);
		genString = new GenericClass<String>("Clases genéricas");
		genVehicle = new GenericClass<Vehicle>(new Vehicle(4, "azul"));

		genInteger.show();
		genDouble.show();
		genString.show();
		genVehicle.show();

	}

	public static void main(String[] args) {

		new MainGenericClass().show();

	}

}
