package tema12_Colecciones.enumMap;

public enum Operation {

	PLUS('+'), MINUS('-'), TIMES('*'), DIVIDE('/');

	private final char symbol;

	Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

}
