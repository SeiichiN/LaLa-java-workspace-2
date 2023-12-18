package p668;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			String str = null;
			fw.write(str);
			fw.close();
		} catch (Exception e) {
			System.out.println("何らかの例外が発生");
		}
		System.out.println("処理が終わりです");
	}

}
