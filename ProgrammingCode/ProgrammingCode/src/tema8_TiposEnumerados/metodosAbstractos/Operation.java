package tema8_TiposEnumerados.metodosAbstractos;

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

	Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public abstract double apply(double x, double y);
	
}