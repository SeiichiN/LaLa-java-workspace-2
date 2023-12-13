package date.p594;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("l1: " + l1);
		LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0);
		System.out.println("l2: " + l2);
		
		ZonedDateTime z1 = l1.atZone(ZoneId.of("Europe/London"));
		System.out.println("z1: " + z1);
		
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println("l3: " + l3);
	}

}
