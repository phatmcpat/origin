/**
 * 
 */

/**
 * @author phatm
 *
 */
public class main extends deck{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		deck pokerDeck = new deck(); //make a new deck
		pokerDeck.makeDeck(); // initialize deck
		
		System.out.println("---Before Shuffling---");
		pokerDeck.printCards();
		pokerDeck.shuffleDeck();
		System.out.println("---After Shuffling---");
		pokerDeck.printCards();
	}

}
