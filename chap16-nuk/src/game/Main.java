package game;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Card> cards = new HashSet<>();
		setupCards(cards);
		
		Player com = new Player("コム");
		Player user = new Player("ユーザー");
		while(true) {
			com.draw(cards);
			user.draw(cards);
			System.out.println("----");			
			System.out.println(com.getName() + " " + com.getCard());
			// System.out.println(user.getName() + " " + user.getCard());
			System.out.println("勝負しますか？ y / n / mもう一枚 / q終");
			String ch = new Scanner(System.in).nextLine().toLowerCase();
			if (ch.equals("m")) {
				user.draw(cards);
				ch = "y";
			}
			if (ch.equals("y")) {
				com.judge(user);
				user.judge(com);
			}
			else if (ch.equals("n")) {
				com.setWin();
				user.setLose();
			}
			else {
				break;
			}
			System.out.println(user.getName() + " " + user.getCard());
			System.out.println(com.getName() + " " + com.getResult());
			System.out.println(user.getName() + " " + user.getResult());
			
		}
		
		System.out.println("bye");

//		for (Card c : cards) {
//			System.out.println(c);
//		}
	}  // main()
	
	public static void setupCards(Set<Card> cards) {
		String[] suits = {"heart", "diamond", "club", "spade"};
		for (int s = 0; s < 4; s++) {
			for (int i = 1; i <= 13; i++) {
				Card c = new Card(suits[s], i);
				cards.add(c);
			}
		}
	}

}  // class
