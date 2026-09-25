package tema2_1_EscrituraEnPantalla.colores;

public class BlockCharacter {

	public void show() {

		char blockCharacter='\u2586';
		String hexadecimalBlockCharacter,hexadecimalBlockCharacterFormatted;
		
		for (int i = 0; i < 14; i++) {
			hexadecimalBlockCharacter=Integer.toHexString((int) blockCharacter);
			hexadecimalBlockCharacterFormatted=String.format("'\\u%s'",hexadecimalBlockCharacter.toUpperCase());
			System.out.printf("%s: %c\n", hexadecimalBlockCharacterFormatted, blockCharacter);
			blockCharacter++;
		}
				
	}
	
	public static void main(String[] args) {

		new BlockCharacter().show();

	}

}