package p686;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
	public int inputNum() {
		int num = 0;
		boolean repeat = false;
		do {
			repeat = false;
			System.out.println("数字を入力 > ");
			try {
				num = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数字ではない");
				repeat = true;
			}
		} while (repeat);
		return num;
	}
	
	public void fileWrite(String str) {
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write(str);
		} catch (IOException e) {
			System.out.println("書き込み例外が発生");
			throw new IllegalStateException("ファイルエラー");
		} 
		System.out.println("書き込み成功");
	}	
}
