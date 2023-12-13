package date.ex15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// 現在日時 p580
		Date now = new Date();
		// Calendarにセット p583
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		// 日を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		// 日にセット p.583 code L9
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		// Date型に変換 p582下
		Date d = c.getTime();
		// p585 SimpleDateFormat
		SimpleDateFormat f =
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d);
		System.out.println(s);		
	}

}
