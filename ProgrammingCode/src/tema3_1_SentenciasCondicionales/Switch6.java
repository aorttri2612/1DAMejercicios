package tema3_1_SentenciasCondicionales;

import java.util.Random;

public class Switch6 {
	
	public void show() {
		
    	Random random = new Random();
    	int seasonCode;
    	String seasonName;
    	
        seasonCode = random.nextInt(4);
        System.out.println(seasonCode);
        seasonName = switch (seasonCode) {
        	case 0: 
        		System.out.println("spring time!");
        	case 1:
        		yield "Summer";
        	case 2:
        		yield "Fall";
        	case 3:
        		yield "Winter";
        	default:
        		yield "???";
        };
        
        System.out.println(seasonName);       		
		
	}
	
    public static void main(String[] args) {
    	
       new Switch6().show();
    	
    }
    
}