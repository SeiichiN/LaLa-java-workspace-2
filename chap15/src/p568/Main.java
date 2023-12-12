package p568;

public class Main {

	public static void main(String[] args) {
		String name = "minato01";
		if (isValidPlayerName(name)) {
			System.out.println("正しい");
		} else {
			System.out.println("まちがい");
		}
	}
	
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Za-z][A-Za-z0-9]{7}");
	}

}
