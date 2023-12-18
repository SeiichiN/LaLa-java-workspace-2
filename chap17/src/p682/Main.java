package p682;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		sub();
	}
	
	public static void sub() {
		try  {
			subsub();
		} catch (IOException e) {
			System.out.println("書き込めません");
		} catch (NullPointerException e) {
			System.out.println("nullです");
		}
	}
	
	public static void subsub() throws NullPointerException, IOException {
		FileWriter fw = new FileWriter("data.txt");
		String str = null;
		fw.write(str);
		fw.close();
		System.out.println("処理が終わりました");
	}

}
