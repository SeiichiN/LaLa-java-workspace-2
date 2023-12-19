package main.after;

public class Main {

	public static void main(String[] args) {
		Hero h1 = Hero.getInstance();
		h1.name = "ミナト";
		Hero h2 = Hero.getInstance();
		h2.name = "アサカ";
		
		System.out.println("h1:" + h1.name + ": " + h1);
		System.out.println("h2:" + h2.name + ": " + h2);
		
		if (h1 == h2) {
			System.out.println("同じインスタンス");
		} else {
			System.out.println("違うインスタンス");
		}

	}

}
