package tema13_ProgramacionFuncional;

import java.util.HashMap;
import java.util.Map;

public class InterfaceBiConsumer {

	public void show() {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			map.put(i, i * i);
		}
		map.forEach((k, v) -> System.out.printf("Clave:%d Valor:%d\n", k, v));

	}

	public static void main(String[] args) {

		new InterfaceBiConsumer().show();

	}

}
