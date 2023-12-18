package p667;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			String str = null;
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			System.out.println("書き込めませんでした");
		} catch (NullPointerException e) {
			System.out.println("nullだよ");
		}
		System.out.println("処理が終わりです");
	}

}
