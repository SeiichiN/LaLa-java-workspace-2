package game.set;

import java.util.Set;

public class Player {
	String name;
	Card card;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void draw(Set<Card> cardSet) {
		Card card = null;
		do {
			int s = (int)(Math.random() * 4);
			int num = (int)(Math.random() * 13) + 1;
			card = new Card(Const.suits[s], num);
		} while (cardSet.remove(card) == false);
		this.card = card;
	}
	
	public void drawHeart(Set<Card> cardSet) {
		Card card = null;
		do {
			int s = 0;
			int num = (int)(Math.random() * 13) + 1;
			card = new Card(Const.suits[s], num);
		} while (cardSet.remove(card) == false);
		this.card = card;
	}

	public String toString() {
		return name + ":" + card;
	}
}
