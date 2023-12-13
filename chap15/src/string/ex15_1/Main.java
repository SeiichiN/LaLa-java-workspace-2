package string.ex15_1;

public class Main {

	public static void main(String[] args) {
		// String s = byPlus();
		String s = bySB();
		System.out.println(s);
		
		String[] a = s.split(",");
		for (String str : a) {
			System.out.print(str + " ");
		}
	}
	
	public static String byPlus() {
		String s = "";
		for (int i = 1; i <= 100; i++) {
			s = s + i + ",";
		}
		return s;
	}
	
	public static String bySB() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i + ",");
		}
		return sb.toString();
	}
}
