package p686;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		Util util = new Util();
		boolean repeat = true;
		while (repeat) {
			System.out.println("年齢は？>");
			int num = util.inputNum();
			try {
				p.setAge(num);
				repeat = false;
			} catch (IllegalArgumentException e) {
				System.out.println("マイナスはだめ");
				repeat = true;
			}
		}
		try {
			util.fileWrite("年齢は" + p.age + "です。");
		} catch (IllegalStateException e) {
			System.out.println("書き込みに失敗しました。");
		}
		System.out.println("pのage:" + p.age);
	}

}
