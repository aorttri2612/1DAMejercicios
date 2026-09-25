package tema8_TiposEnumerados.sobrescribirToString;

public enum Operation {

	PLUS('+'), MINUS('-'), TIMES('*'), DIVIDE('/');

	private final char symbol;

	Operation(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}
	
	/* Se anula el toString para pasarlo a UpperCamelCase.
	 * Con el super.toString() se llama al anulado, 
	 * que es el que lo devuelve en mayúsculas, y con este 
	 * método, se transforma a UpperCamelCase.
	 */
	@Override
	public String toString() {
		return super.toString().substring(0,1).concat(super.toString().substring(1).toLowerCase());
	}

}
