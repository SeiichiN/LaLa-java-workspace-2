package ex15_2;

public class Main {

	public static void main(String[] args) {
		String folder1 = "c:¥javadev";
		String folder2 = "c:¥user¥";
		String file = "readme.txt";
		String filename = makeFileName(folder1, file);
		System.out.println(filename);
	}
	
	public static String makeFileName(String folder, String filename) {
		if (folder.endsWith("¥")) {
			return folder + filename;
		} else {
			return folder + "¥" + filename;
		}
	}

}
