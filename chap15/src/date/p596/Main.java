package date.p596;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate =
				LocalDate.parse("2020/09/22", fmt);
		System.out.println("ldate: " + ldate);
		
		LocalDate ldatep = ldate.plusDays(1000);
		System.out.println("1000日後ldatep:" + ldatep);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です。");
		}

	}

}
