package date.p583;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		c.set(2019, 8, 22);   // 0 start
		c.set(Calendar.MONTH, 0);   // 0 start
		System.out.println("c: " + c.getTime());
		Date d = c.getTime();
		System.out.println(d);
		
		Date now = new Date();
		c.setTime(now);
		System.out.println(c.get(Calendar.MONTH));
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
