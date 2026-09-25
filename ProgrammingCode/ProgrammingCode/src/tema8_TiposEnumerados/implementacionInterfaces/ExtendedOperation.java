package tema8_TiposEnumerados.implementacionInterfaces;

public enum ExtendedOperation implements Operation {

	EXP('^') {
		@Override
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},
	REMAINDER('%') {
		@Override
		public double apply(double x, double y) {
			return x % y;
		}
	};

	private final char symbol;

	ExtendedOperation(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public char getSymbol() {
		return symbol;
	}

}
