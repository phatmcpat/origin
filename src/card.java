
public class card {
	//card object component variables
	
	int value = 0;
	String valString = "";
	String suit = "";
	
	//getters and setters for card object
	public int getValue() {
		return this.value;
	}
	public String getStringValue() {
		return this.valString;
	}
	
	public void setValue(int passValue) {
		this.value = passValue;
		switch (this.value) {
		case 0:
			break;
		case 1:
			this.valString = "Ace";
			break;
		case 2:
			this.valString = "Two";
			break;
		case 3:
			this.valString = "Three";
			break;
		case 4:
			this.valString = "Four";
			break;
		case 5:
			this.valString = "Five";
			break;
		case 6:
			this.valString = "Six";
			break;
		case 7:
			this.valString = "Seven";
			break;
		case 8:
			this.valString = "Eight";
			break;
		case 9:
			this.valString = "Nine";
			break;
		case 10:
			this.valString = "Ten";
			break;
		case 11:
			this.valString = "Jack";
			break;
		case 12:
			this.valString = "Queen";
			break;
		case 13:
			this.valString = "King";
			break;
		}
	}
	public String getSuit() {
		return this.suit;
	}
	public void setSuit(String passSuit) {
		this.suit = passSuit;
	}
}
