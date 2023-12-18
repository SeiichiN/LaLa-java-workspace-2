package p669;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			String str = "hello!";
			fw.write(str);
		} catch (IOException e) {
			System.out.println("何らかの例外が発生");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
		System.out.println("処理が終わりです");
	}

}
