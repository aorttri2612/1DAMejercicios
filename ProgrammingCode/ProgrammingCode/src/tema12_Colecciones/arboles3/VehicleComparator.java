package tema12_Colecciones.arboles3;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		int result = o1.getColour().compareTo(o2.getColour());
		if (result == 0) {
			result = o1.getRegistration().compareTo(o2.getRegistration());
		}
		return result;
	}

}
