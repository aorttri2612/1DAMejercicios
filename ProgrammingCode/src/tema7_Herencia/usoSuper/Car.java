package tema7_Herencia.usoSuper;

public class Car extends Vehicle {

	private double gasoline;

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

	@Override
	public void accelerate(double amount) {
		super.accelerate(amount);//Uso de super para llamar al método del padre
		gasoline -= amount * 0.01;
	}

}
