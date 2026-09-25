package tema7_Herencia.interfaces;

public interface GasolineMotor extends ActionsVehicle {//GasolineMotor hereda de la interfaz ActionsVehicle

	double getGasoline();

	void refuel(double liters);

}
