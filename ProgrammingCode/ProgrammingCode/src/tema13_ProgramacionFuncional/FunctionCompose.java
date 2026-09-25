package tema13_ProgramacionFuncional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionCompose {

	public void show() {

		Function<Integer, Integer> elevarAlCuadrado = n -> n * n;
		Function<Integer, String> aCadena = String::valueOf;
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.computeIfAbsent(i, aCadena.compose(elevarAlCuadrado));
		}
		map.forEach((k, v) -> System.out.printf("Clave:%d Valor:%s\n", k, v));

	}

	public static void main(String[] args) {

		new FunctionCompose().show();

	}

}
