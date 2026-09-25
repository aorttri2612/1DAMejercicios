package tema8_TiposEnumerados;

public enum Operation {

	PLUS('+'), MINUS('-'), TIMES('*'), DIVIDE('/');//El ; es necesario cuando se definen atributos

	private final char symbol;

	Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

}
