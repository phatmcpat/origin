import java.io.*;
import java.lang.*;
import java.util.*;

public class deck extends card{
	int cardCount = 52;
	String suits[] = { "Hearts", "Diamonds", "Clubs", "Hearts" };
	card cards[] = new card[52];
	
	public void makeDeck() {
		try {	
			for (int i = 0; i < 4; i++) { //for each suit
				System.out.println("Current Suit is " + suits[i]);
				for (int j = 0; j < 13; j++) { //for each card in each suit
					System.out.println((j+1)*(i+1)-1);
					cards[((j+1)*(i+1)-1)].setSuit(suits[i]);
					cards[((j+1)*(i+1)-1)].setValue(j+1);
					System.out.println("Current Card is " + cards[((j+1)*(i+1)-1)]);
				}		
			}
		}
		catch (NullPointerException e) {
		    // Print exception details
			e.printStackTrace();
        }
	} 
	
	public void shuffleDeck () {
		//make the cards into a list so I can utilize the shuffle function instead of generating randoms and assigning them manually
		List<card> tempDeck = Arrays.asList(cards);
		//shuffle three times, as is standard
		Collections.shuffle(tempDeck);
		Collections.shuffle(tempDeck);
		Collections.shuffle(tempDeck);
		//set back as cards (from list to array)
		tempDeck.toArray(cards);
	}
	
	public void printCards () {
		System.out.println("Cards, in order they are in the array are:");
		for (int i = 0; i < cardCount; i++) {
			System.out.println("At position " + i + " in the deck, the card is the " + cards[i].getStringValue() + " of " + cards[i].getSuit());
		}
	}
}
