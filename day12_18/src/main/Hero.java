package main;

public class Hero {
	private static Hero instance = new Hero();
	private String name;
	private int hp;
	
	private Hero() {
		this.name = "ミナト";
		this.hp = 100;
	}

	public static Hero getInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
