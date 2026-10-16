package sentenciasCondicionalesMultiples;

import java.util.Random;

public class Ejercicio4 {
	
	 public void show() {
	        Random random = new Random();

	        int suit = random.nextInt(4);
	        int card = random.nextInt(13);

	        String suitName;
	        String cardName;

	        switch (suit) {
	            case 0 -> suitName = "♠";
	            case 1 -> suitName = "♥";
	            case 2 -> suitName = "♦";
	            default -> suitName = "♣";
	        }

	        switch (card) {
	            case 0 -> cardName = "As";
	            case 1 -> cardName = "2";
	            case 2 -> cardName = "3";
	            case 3 -> cardName = "4";
	            case 4 -> cardName = "5";
	            case 5 -> cardName = "6";
	            case 6 -> cardName = "7";
	            case 7 -> cardName = "8";
	            case 8 -> cardName = "9";
	            case 9 -> cardName = "10";
	            case 10 -> cardName = "Jota";
	            case 11 -> cardName = "Reina";
	            default -> cardName = "Rey";
	        }

	        System.out.printf("The card is: %s of %s%n", cardName, suitName);
	    }

	public static void main(String[] args) {
		new Ejercicio4().show();

	}

}
