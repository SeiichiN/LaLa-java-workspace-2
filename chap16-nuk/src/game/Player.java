package game;

import java.util.Random;
import java.util.Set;

public class Player {
	private String name;
	private Card card;
	private String result;
	
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	
	public void draw(Set<Card> cards) {
		String[] suits = {"heart", "diamond", "club", "spade"};
		int s = new Random().nextInt(suits.length);
		int n = new Random().nextInt(13) + 1;
		Card card = new Card(suits[s], n);
		cards.remove(card);
		this.card = card;
	}
	
	public void judge(Player target) {
		int me = this.getCard().getNumber();
		int you = target.getCard().getNumber();
		if (me == 1) { me = 14; }
		if (you == 1) { you = 14; }
		if (me == you) {
			this.result = "draw";
		} else if (me > you) {
			this.result = "win";
		} else {
			this.result = "lose";
		}
	}
	public void setWin() {
		this.result = "win";
	}
	public void setLose() {
		this.result = "lose";
	}
	public String getName() {
		return name;
	}
	public Card getCard() {
		return card;
	}
	public String getResult() {
		return result;
	}

}
