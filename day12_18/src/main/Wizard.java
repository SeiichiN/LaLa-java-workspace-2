package main;

public class Wizard {
	private String name;
	private int hp;
	public Wizard(String name) {
		this.name = name;
		this.hp = 100;
	}
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", hp=" + hp + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
