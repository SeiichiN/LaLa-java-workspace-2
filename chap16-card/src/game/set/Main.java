package game.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Card> cardSet = new HashSet<>();
		setupHeart(cardSet);
		Player com = new Player("コム");
		Player user = new Player("ユーザー");
		com.drawHeart(cardSet);
		user.drawHeart(cardSet);
		System.out.println(com);
		System.out.println(user);
		if (com.card.num == user.card.num) {
			System.out.println("引き分け");
		} else if (com.card.num < user.card.num) {
			System.out.println(user.name + "の勝ち");
		} else {
			System.out.println(com.name + "の勝ち");
		}
	}

	public static void setup(Set<Card> cardSet) {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				Card card = new Card(Const.suits[i], j);
				cardSet.add(card);
			}
		}
	}

	public static void setupHeart(Set<Card> cardSet) {
		int i = 0;
		for (int j = 1; j <= 13; j++) {
			Card card = new Card(Const.suits[i], j);
			cardSet.add(card);
		}

	}
}
