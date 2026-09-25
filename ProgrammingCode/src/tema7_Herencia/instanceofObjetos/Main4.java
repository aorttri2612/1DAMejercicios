package tema7_Herencia.instanceofObjetos;

public class Main4 {

	public void showInstanceof() {

		Vehicle vehicle = new Car(4, "rojo");	
		
		if(vehicle instanceof Car car && car.getGasoline()==0) {
			car.refuel(100);
			System.out.println(car);
		}
		
	}

	public static void main(String[] args) {

		new Main4().showInstanceof();

	}

}
