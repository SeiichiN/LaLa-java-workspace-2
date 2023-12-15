package set.p630;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> colors = new TreeSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("緑");
		colors.add("橙");
		colors.add("黄緑");
		colors.add("桃");
		for (String s : colors) {
			System.out.println(s + "->");
		}

	}

}
