package game.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Card> cards = new HashSet<>();
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
	
	public static void setupCards(Set<Card> cards) {
		for (int s = 0; s < 4; s++) {
			for (int i = 1; i <= 13; i++) {
				Card c = new Card(Const.SUITS[s], i);
				cards.add(c);
			}
		}
	}

}  // class
