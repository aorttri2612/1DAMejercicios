package tema12_Colecciones.enumSet;

public enum Operation {

	PLUS('+'), MINUS('-'), TIMES('*'), DIVIDE('/');

	private final char symbol;

	private Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

}
