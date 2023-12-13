package string.p562;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		byStringBuilder();
		// byPlus();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ミリ秒");
	}
	
	public static void byStringBuilder() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
			if (i % 100 == 0) {
				sb.append("\n");
			}
		}
		String s = sb.toString();
		System.out.println(s);
	}

	public static void byPlus() {
		String s = "";
		for (int i = 0; i < 10000; i++) {
			s += "Java";
			if (i % 100 == 0) {
				s += "\n";
			}
		}
		System.out.println(s);
	}
}
