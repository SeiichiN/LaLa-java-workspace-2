package date.p598;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		Period p1 = Period.ofDays(3);
		System.out.println("p1: " + p1);
		Period p2 = Period.between(d1, d2);
		System.out.println("p2: " + p2);
		
		LocalDate d3 = d2.plus(p2);
		System.out.println("d3: " + d3);
	}

}
