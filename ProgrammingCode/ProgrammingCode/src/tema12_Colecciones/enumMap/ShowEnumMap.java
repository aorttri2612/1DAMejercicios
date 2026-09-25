package tema12_Colecciones.enumMap;

import java.util.EnumMap;
import java.util.Map;

public class ShowEnumMap {

	public void show() {

		EnumMap<Operation, String> operationsMap = new EnumMap<>(Operation.class);
		operationsMap.put(Operation.PLUS, "Esta operación se utiliza para sumar");
		operationsMap.put(Operation.MINUS, "Esta operación se utiliza para restar");
		operationsMap.put(Operation.TIMES, "Esta operación se utiliza para multiplicar");
		operationsMap.put(Operation.DIVIDE, "Esta operación se utiliza para dividir");
		for (Map.Entry<Operation, String> entry : operationsMap.entrySet()) {
			System.out.printf("%-6s: %s\n", entry.getKey(), entry.getValue());
		}

	}

	public static void main(String[] args) {

		new ShowEnumMap().show();

	}

}
