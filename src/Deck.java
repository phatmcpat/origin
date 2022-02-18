/**
 * @author Patrick McNierney <patrick.mcnierney@gmail.com>
 * Date Last Updated: 2/18/2022
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class Deck extends Card{
	int CardCount = 52;
	String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
	Card Cards[] = new Card[52];
	//initialize the array with Card objects with static block
	{
		for (int i = 0; i<52; i++)
			Cards[i] = new Card();
	}
	
	//default constructor
	public static void main(String args[])
	{
		Deck d = new Deck();
	}
	
	public void makeDeck() {
		int CardIterator = 1;
		try {	
			for (int i = 0; i < 4; i++) { //for each suit
				System.out.println("Current Suit is " + suits[i]);
				for (int j = 0; j < 13; j++) { //for each Card in each suit
					Cards[(CardIterator-1)].setSuit(suits[i]);
					Cards[(CardIterator-1)].setValue(j+1);
					System.out.println("Current Card is " + (CardIterator));
					CardIterator++;
				}		
			}
		}
		catch (NullPointerException e) {
		    // Print exception details
			e.printStackTrace();
        }
	} 
	
	public void shuffleDeck () {
		//make the Cards into a list so I can utilize the shuffle method instead of generating randoms and assigning them manually
		List<Card> tempDeck = Arrays.asList(Cards);
		//shuffle three times, as is standard
		Collections.shuffle(tempDeck);
		Collections.shuffle(tempDeck);
		Collections.shuffle(tempDeck);
		//set back as Cards (from list to array)
		tempDeck.toArray(Cards);
	}
	
	public void printCards () {
		System.out.println("Cards, in order they are in the array are:");
		for (int i = 0; i < CardCount; i++) {
			System.out.println("At position " + (i+1) + " in the Deck, the Card is the " + Cards[i].getStringValue() + " of " + Cards[i].getSuit());
		}
	}
}
