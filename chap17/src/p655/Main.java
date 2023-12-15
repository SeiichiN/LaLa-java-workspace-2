package p655;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("ハロー!");
			fw.close();
		} catch (IOException e) {
			System.out.println("エラーです。中断します。");
		}

	}

}
