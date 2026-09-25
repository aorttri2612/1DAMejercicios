package tema8_TiposEnumerados.ordinal;

public enum Operation {

	PLUS(1, '+'), MINUS(2, '-'), TIMES(3, '*'), DIVIDE(4, '/');

	private final int optionNumber;
	private final char symbol;

	Operation(int optionNumber, char symbol) {
		this.optionNumber = optionNumber;
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public int getOptionNumber() {
		return optionNumber;
	}

}
