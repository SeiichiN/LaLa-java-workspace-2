package ex16_3;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		var heros = new HashMap<Hero, Integer>();
		Hero h1 = new Hero("斎藤");
		heros.put(h1, 3);
		Hero h2 = new Hero("鈴木");
		heros.put(h2, 7);
		for (Hero key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println
				(key.getName() + "が倒した敵=" + value);
		}
	}

}
