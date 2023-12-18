package p686;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
	// p679 参考
	public static boolean writeAge(int age) {
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("pの年齢は" + age + "です。");
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}
