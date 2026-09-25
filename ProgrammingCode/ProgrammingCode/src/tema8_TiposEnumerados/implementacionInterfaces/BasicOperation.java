package tema8_TiposEnumerados.implementacionInterfaces;

public enum BasicOperation implements Operation {

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

	BasicOperation(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public char getSymbol() {
		return symbol;
	}

}