package game.list;

import java.util.List;
import java.util.Random;

public class Player {
	private String name;
	private Card card;
	
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	
	public void draw(List<Card> cards) {
		int num = new Random().nextInt(cards.size());
		this.card = cards.remove(num);
	}
	public String getName() {
		return name;
	}
	public Card getCard() {
		return card;
	}	

}
