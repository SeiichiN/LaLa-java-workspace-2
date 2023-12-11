package p542;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		System.out.println("---------------------");
		Hero h1 = new Hero("ミナト", 100);
		Hero h2 = new Hero("アサカ", 120);
//		Hero.money = 10000;
		System.out.println(h1.hp);
		System.out.println(h2.hp);
		System.out.println(Hero.money);
		System.out.println(h1.money);
		h1.setRandomMoney();
		System.out.println(h2.money);

		
	}

}
