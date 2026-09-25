package tema7_Herencia.castingObjetos;

public class Main {

	public void showObjectCasting() {

		Vehicle vehicle;
		Car car;

		car = new Car(4, "rojo");
		System.out.printf("Coche: %d ruedas y de color %s", car.getWheelCount(), car.getColour());

		vehicle = car;//A vehicle se le está asignando un objeto de tipo Car, que es una subclase de myClass
		System.out.printf("\nCoche: %d ruedas y de color %s", vehicle.getWheelCount(), vehicle.getColour());
		vehicle.refuel(50);//Error de compilación: el método refuel no está definido para el tipo myClass

		car = vehicle;//Error de compilación: falta de coincidencia de tipos, no puede convertir de myClass a Car
		car = (Car) vehicle;//Solucionado con un casting ya que vehicle contiene un Car

		vehicle = new Vehicle(2, "blanco");
		car = (Car) vehicle; //Error de ejecución: ClassCastException ya que vehicle no contiene un objeto de tipo Car
	}

	public static void main(String[] args) {

		new Main().showObjectCasting();

	}

}
