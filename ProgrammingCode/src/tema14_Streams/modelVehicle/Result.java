package tema14_Streams.modelVehicle;


import java.util.Optional;

public class Result{

	private Optional<ModelVehicle> min;
	private Optional<ModelVehicle> max;

	public Result(Optional<ModelVehicle> min,Optional<ModelVehicle> max) {
		this.min = min;
		this.max = max;
	}

	public Optional<ModelVehicle> getMin() {
		return min;
	}

	public Optional<ModelVehicle> getMax() {
		return max;
	}

}