package p686;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		boolean repeat = true;
		while (repeat) {
			try {
				System.out.println("年齢は？>");
				int num = new Scanner(System.in).nextInt();
				p.setAge(num);
				repeat = false;
			} catch(InputMismatchException e) {
				System.out.println("数字ですよ！");
			} catch(IllegalArgumentException e) {
				System.out.println("マイナスはだめ");
			}
		}
		
		if (FileUtil.writeAge(p.age)) {
			System.out.println("年齢をdata.txtに書き込みました");
		} else {
			System.out.println("年齢の書き込みに失敗しました");
		}
	}

}
