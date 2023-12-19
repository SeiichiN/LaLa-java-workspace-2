package main.after;

public class Hero {
	private static Hero instance = new Hero();
	String name;
	
	private Hero() {
		// newできない
	}
	
	public static Hero getInstance() {
		return instance;
	}
}
