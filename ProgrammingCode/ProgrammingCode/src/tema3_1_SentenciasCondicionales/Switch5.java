package tema3_1_SentenciasCondicionales;

import java.util.Random;

public class Switch5 {
	
	public void show() {
		
		Random random = new Random();
    	int seasonCode;
    	String seasonName;
		
		seasonCode = random.nextInt(4);
        seasonName = switch (seasonCode) {
        	/* El bloque debe salir a través de una 
        	 * sentencia yield que devuelva el valor
        	 * del bloque:
        	 */
            case 0 -> {
                System.out.println("spring time!");
                yield "Spring";
            }
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "???";
        };
        
        System.out.println(seasonName);		
		
	}
	
	public static void main(String[] args) {
		
		new Switch5().show();
               
    }
    
}