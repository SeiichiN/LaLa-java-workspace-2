package date.ex15_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// 1. 現在日時を LocalDate now  p.594
		LocalDate now = LocalDate.now();
		
		// 2. 100日後を LocalDate d
		LocalDate d = now.plusDays(100);
		
		// 西暦 年 日で表示
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String s = d.format(fmt);
		System.out.println(s);

	}

}
