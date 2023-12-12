package ex15_3;

public class Main {

	public static void main(String[] args) {
		String pattern1 = ".*";
		String pattern2 = "A[0-9][0-9]?";
		String pattern3 = "U[A-Z]{3}";
		
		String str = "UDGE";
		if (str.matches(pattern3)) {
			System.out.println("マッチしています");
		} else {
			System.out.println("マッチしていません");
		}

	}

}
