package tema14_Streams.modelVehicle;

import java.util.List;

public class ModelVehicle{

	private String model;
	private int wheelCount;
	private List<String> colours;

	public ModelVehicle(String model, int wheelCount, List<String> colours) {
		this.model = model;
		this.wheelCount = wheelCount;
		this.colours = colours;
	}
	
	public String getModel() {
		return model;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public List<String> getColours() {
		return colours;
	}

	@Override
	public String toString() {
		return String.format("Modelo: %s Número de ruedas: %d Colores: %s", model, wheelCount, String.join(", ", colours));
	}

}