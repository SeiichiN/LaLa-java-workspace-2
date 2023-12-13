package game.list;

import java.util.Objects;

public class Card {
	String suit;
	int num;
	
	public Card (String suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public String toString() {
		return suit + ":" + num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return num == other.num && Objects.equals(suit, other.suit);
	}
}
