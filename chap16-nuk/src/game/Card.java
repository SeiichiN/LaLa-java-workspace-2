package game;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(number, suit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		return number == other.number && Objects.equals(suit, other.suit);
	}
	

	
}
