package matsu;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    List<Hero> list = new ArrayList<>();
	    Hero h1 = new Hero();
	    h1.name = "ミナト";
	    list.add(h1);
	    System.out.println("要素数=" + list.size());
	    h1 = new Hero();
	    h1.name = "ミナト";
	    System.out.println(list.remove(h1));
	    System.out.println("要素数=" + list.size());
	}

}
