package p542;

public class Hero {
	String name;
	int hp;
	static int money;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
}
