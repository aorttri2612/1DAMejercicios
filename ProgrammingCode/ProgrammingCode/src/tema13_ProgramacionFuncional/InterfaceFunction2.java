package tema13_ProgramacionFuncional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class InterfaceFunction2 {

	public void show() {

		Function<Integer, Integer> elevarAlCuadrado = n -> n * n;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, null);//se va a ejecutar la Function porque su valor asociado es null
		map.put(1, 0);//no se va a ejecutar la Function porque tiene un valor distinto de null
		for (int i = 0; i < 10; i++) {
			map.computeIfAbsent(i, elevarAlCuadrado);
		}
		map.forEach((k, v) -> System.out.printf("Clave:%d Valor:%d\n", k, v));

	}

	public static void main(String[] args) {

		new InterfaceFunction2().show();

	}

}
