package tema7_Herencia.anulacionMetodos;

public class Car extends Vehicle {

	private double gasoline;

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

	@Override
	public void accelerate(double amount) {//Anula el método heredado accelerate
		speed += amount;
		gasoline -= amount * 0.01;//Se consume de gasolina un 1% de amount
	}

}
