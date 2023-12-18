package p667;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			String str = "いいよ";
			fw.write(str);
			fw.close();
		} catch (IOException | NullPointerException e) {
			System.out.println("あきませんわ");
		}
		System.out.println("処理が終わりです");
	}

}
