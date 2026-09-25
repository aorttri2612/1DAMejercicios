package tema3_1_SentenciasCondicionales;

import java.util.Random;

public class Switch4 {
	
	public void show() {
		
		Random random = new Random();
    	int seasonCode, numLetters;
    	String seasonName;
		
		seasonCode = random.nextInt(4);
        seasonName = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "???";
        };
        
        System.out.println(seasonName);
        
        numLetters = switch (seasonName) {
        	//Varias etiquetas separadas por comas:
            case "Spring", "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };
        
        System.out.println(numLetters);		
		
	}
	
	public static void main(String[] args) {
		
		new Switch4().show();
        
    }
    
}