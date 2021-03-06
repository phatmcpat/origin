/**
 * @author Patrick McNierney <patrick.mcnierney@gmail.com>
 * Date Last Updated: 2/18/2022
 */
public class main extends Deck{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck pokerDeck = new Deck(); //make a new Deck
		pokerDeck.makeDeck(); // initialize Deck
		
		System.out.println("---Before Shuffling---");
		pokerDeck.printCards();
		pokerDeck.shuffleDeck();
		System.out.println("---After Shuffling---");
		pokerDeck.printCards();
	}

}
