package tema7_Herencia.instanceofObjetos;

public class Main3 {

	public void showInstanceof() {

		Vehicle vehicle = new Car(4, "rojo");	
		
		if(vehicle instanceof Car car) {
			car.refuel(100);
			System.out.println(car);
		}else {
			car.refuel(50);//Error de compilación
		}

	}

	public static void main(String[] args) {

		new Main3().showInstanceof();

	}

}
