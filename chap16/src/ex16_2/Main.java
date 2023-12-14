package ex16_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		Hero saito = new Hero("斎藤");
		heros.add(saito);
		heros.add(new Hero("鈴木"));
		
		for (Hero h : heros) {
			System.out.println(h.getName());
		}

	}

}
