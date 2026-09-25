package tema12_Colecciones.mapas;

import java.util.Map;

public enum Operation {

	PLUS('+') {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS('-') {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES('*') {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE('/') {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};

	private final char symbol;

	private static final Map<Character, Operation> symbolToOperation = Map.of(Operation.PLUS.getSymbol(), Operation.PLUS,
			Operation.MINUS.getSymbol(), Operation.MINUS, Operation.TIMES.getSymbol(), Operation.TIMES,
			Operation.DIVIDE.getSymbol(), Operation.DIVIDE);

	Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public abstract double apply(double x, double y);

	public static Operation fromSymbol(char symbol) {
		return symbolToOperation.get(symbol);
	}

}