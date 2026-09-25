package tema3_1_SentenciasCondicionales;

import java.util.Random;

public class Switch3 {
	
	public void show() {
		
    	Random random = new Random();
    	int seasonCode;
    	String seasonName;
    	
        seasonCode = random.nextInt(4);
        System.out.println(seasonCode);
        /* Al ser el switch una expresión, se puede
         * asignar el valor devuelto a una variable:
         */
        seasonName = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "???";
        };
        
        System.out.println(seasonName);		
		
	}
	
    public static void main(String[] args) {
    	
    	new Switch3().show();
        
    }
    
}