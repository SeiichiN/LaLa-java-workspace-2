package main;

public class Main {

	public static void main(String[] args) {
		makeWizard();
		System.out.println("-------------------");
		makeHero();
	}

	public static void makeWizard() {
		Wizard w1 = new Wizard("ミナト");
		Wizard w2 = new Wizard("アサカ");
		if (w1 == w2) {
			System.out.println("同じインスタンス");
		} else {
			System.out.println("違うインスタンス");
		}
		System.out.println("w1 " + w1);
		System.out.println("w2 " + w2);
		w1.setName("スガワラ");
		System.out.println("w1 " + w1);
		System.out.println("w2 " + w2);
	}
	
	public static void makeHero() {
		Hero h1 = Hero.getInstance();
		Hero h2 = Hero.getInstance();
		if (h1 == h2) {
			System.out.println("同じインスタンス");
		} else {
			System.out.println("違うインスタンス");
		}
		System.out.println("h1 " + h1);
		System.out.println("h2 " + h2);
		h1.setName("アサカ");
		System.out.println("h1 " + h1);
		System.out.println("h2 " + h2);
	}

}
