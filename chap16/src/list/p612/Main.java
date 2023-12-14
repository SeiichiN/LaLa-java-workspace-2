package list.p612;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(Integer.valueOf(10));
		points.add(80);
		points.add(75);
		for (Integer i : points) {
			System.out.println(i.intValue());
		}
	}

}
