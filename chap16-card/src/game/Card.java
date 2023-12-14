package game;

public class Card {
	private String suit;
	private int number;
	
	public Card() {}
	public Card(String suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public String getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return suit + ":" + number;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if (number != other.number)
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
}
