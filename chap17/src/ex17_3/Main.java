package ex17_3;

public class Main {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("数字に変換できません");
			e.printStackTrace();
		}

	}

}
