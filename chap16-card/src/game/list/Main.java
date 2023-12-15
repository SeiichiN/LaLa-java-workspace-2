package game.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Card> cards = new ArrayList<>();
		setupCards(cards);

		
		Player com = new Player("コム");
		Player user = new Player("ユーザー");
		com.draw(cards);
		user.draw(cards);
		System.out.println(com.getName() + " " + com.getCard());
		System.out.println(user.getName() + " " + user.getCard());
		System.out.println("勝負しますか？ y/n/m:もう一枚");
		
		System.out.println(cards.size());

		for (Card c : cards) {
			System.out.println(c);
		}
	}  // main()
	
	public static void setupCards(List<Card> cards) {
		String[] suits = {"heart", "diamond", "club", "spade"};
		for (int s = 0; s < 4; s++) {
			for (int i = 1; i <= 13; i++) {
				Card c = new Card(suits[s], i);
				cards.add(c);
			}
		}
	}

}  // class
