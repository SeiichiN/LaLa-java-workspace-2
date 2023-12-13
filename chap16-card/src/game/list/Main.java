package game.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Card> cardList = new ArrayList<>();
		setup(cardList);
//		Collections.shuffle(cardList);
//		printList(cardList);
		System.out.println(cardList.size());
		System.out.println("---------------------------");
		Card card = new Card("heart", 13);
		cardList.remove(card);
		System.out.println(cardList.size());
		
//		printList(cardList);
//		Player com = new Player("コム");
//		Player user = new Player("ユーザー");
//		com.draw(cardList);
//		user.draw(cardList);
//		System.out.println(com);
//		System.out.println(user);
//		if (com.card.num == user.card.num) {
//			System.out.println("引き分け");
//		} else if (com.card.num < user.card.num) {
//			System.out.println(user.name + "の勝ち");
//		} else {
//			System.out.println(com.name + "の勝ち");
//		}
	}

	public static void setup(List<Card> cardList) {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				Card card = new Card(Const.suits[i], j);
				cardList.add(card);
			}
		}
	}
	
	public static void printList(List<Card> cardList) {
		for (Card card : cardList) {
			System.out.println(card);
		}
	}

	public static void setupHeart(List<Card> cardList) {
		int i = 0;
		for (int j = 1; j <= 13; j++) {
			Card card = new Card(Const.suits[i], j);
			cardList.add(card);
		}

	}
}
