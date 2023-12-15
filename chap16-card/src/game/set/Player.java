package game.set;

import java.util.Random;
import java.util.Set;

public class Player {
	private String name;
	private Card card;
	
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	
	public void draw(Set<Card> cards) {
		int n = new Random().nextInt(4);
		int num = new Random().nextInt(13) + 1;
		Card card = new Card(Const.SUITS[n], num);
		if (cards.remove(card)) {
			this.card = card;
		} else {
			System.out.println("抜き取り失敗");
		}
	}
	public String getName() {
		return name;
	}
	public Card getCard() {
		return card;
	}	

}
